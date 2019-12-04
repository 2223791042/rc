package guet.hxm.rc.controller;

import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.entity.Application;
import guet.hxm.rc.entity.RecEmail;
import guet.hxm.rc.entity.RecUser;
import guet.hxm.rc.enums.ApplicationEnum;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.RecUserService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.net.URLDecoder;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/rec")
public class RecController {
    @Autowired
    private RecUserService recUserService;

    @Autowired
    private JavaMailSender javaMailSender;

    @ResponseBody
    @PutMapping("/changePwd")
    public ResultVO changePwd(HttpSession httpSession, String oldPassword, String newPassword){
        RecUser recUser = (RecUser) httpSession.getAttribute("recUser");
        if(recUser.getPassword().equals(oldPassword)){
            try{
                recUser.setPassword(newPassword);
                recUserService.editRecUser(recUser);
                return ResultVOUtil.success();
            }catch (Exception e){
                return ResultVOUtil.fail("修改密码失败");
            }
        }else {
            return ResultVOUtil.fail("原密码错误");
        }
    }

    @Value("${fileRootPath}")
    private String fileRootPath;

    @GetMapping("/index")
    public String index(HttpSession httpSession, Model model){
        RecUser recUser =(RecUser) httpSession.getAttribute("recUser");
        model.addAttribute("recUser",recUser);
        Application application = recUserService.getApplication(recUser.getEmail());
        if (application != null){
            model.addAttribute("apply", application);
            if (application.getApplicationStatus().equals(ApplicationEnum.SAVE.getApplicationStatus())){
                return "rec-index";
            }else{
                return "application-detail";
            }
        }else {
            application = new Application();
            model.addAttribute("apply", application);
            return "rec-index";
        }
    }

    @ResponseBody
    @PostMapping("/application/{type}")
    public ResultVO application(@PathVariable("type")String type, Application application,
                              @RequestParam("resumeFileS")MultipartFile resumeFileS,
                              @RequestParam("academicFileS")MultipartFile academicFileS,
                              @RequestParam("scoreFileS")MultipartFile scoreFileS,
                              @RequestParam("languageFileS")MultipartFile languageFileS,
                              @RequestParam("degreeFileS")MultipartFile degreeFileS){
        if(!resumeFileS.isEmpty()){
            application.setResumeFile(saveFile(resumeFileS, application.getName()));
        }
        if(!academicFileS.isEmpty()){
            application.setAcademicFile(saveFile(academicFileS, application.getName()));
        }
        if (!scoreFileS.isEmpty()){
            application.setScoreFile(saveFile(scoreFileS, application.getName()));
        }
        if (!languageFileS.isEmpty()){
            application.setLanguageFile(saveFile(languageFileS, application.getName()));
        }
        if(!degreeFileS.isEmpty()){
            application.setDegreeFile(saveFile(degreeFileS, application.getName()));
        }
        try{
            Application saveApplication = recUserService.getApplication(application.getEmail());
            if (saveApplication == null){
                recUserService.saveApplication(application, type);
            }else {
                application.setApplicationId(saveApplication.getApplicationId());
                recUserService.editApplication(application, type);
            }
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("申请失败");
        }
    }

    public String saveFile(MultipartFile multipartFile,String name){
        try {
            String fileName = multipartFile.getOriginalFilename();
            String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/application/"+name;
            folderPath = URLDecoder.decode(folderPath, "UTF-8");
            File folder = new File(folderPath);
            if (!folder.exists()){
                folder.mkdirs();
            }
            File dest = new File(folderPath + "/" + fileName);
            multipartFile.transferTo(dest);
            return fileRootPath + "/application/"+name+"/"+fileName;
        }catch (Exception e){
            return null;
        }
    }

    @GetMapping("/login")
    public String login(){
        return "rec-login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("recUser");
        session.invalidate();
        return "rec-login";
    }

    @ResponseBody
    @PostMapping("/login")
    public ResultVO login(RecUser recUser, HttpSession httpSession){
        RecUser saveRecUser = recUserService.getRecUser(recUser.getEmail());
        if (saveRecUser == null){
            return ResultVOUtil.fail("账户不存在!");
        }
        if (!saveRecUser.getPassword().equals(recUser.getPassword())){
            return ResultVOUtil.fail("密码错误!");
        }
        httpSession.setAttribute("recUser", saveRecUser);
        return ResultVOUtil.success();
    }

    @ResponseBody
    @PostMapping("/register")
    public ResultVO register(RecUser recUser,String verifyCode){
        RecEmail recEmail = recUserService.getRecEmail(recUser.getEmail());
        RecUser saveUser = recUserService.getRecUser(recUser.getEmail());
        if (recEmail == null){
            return ResultVOUtil.fail("该邮箱验证码从未发送！请点击发送验证码！");
        }
        if (saveUser != null){
            return ResultVOUtil.fail("该邮箱已经被使用！请换个邮箱!");
        }
        if (!recEmail.getCode().toUpperCase().equals(verifyCode.toUpperCase())){
            return ResultVOUtil.fail("验证码错误!");
        }
        try{
            recUserService.saveRecUser(recUser);
            recUserService.confirmRecEmail(recUser.getEmail());
        }catch (Exception e){
            return ResultVOUtil.fail("注册失败!");
        }
        return ResultVOUtil.success();
    }

    @ResponseBody
    @GetMapping("/emailVerify")
    public ResultVO emailVerify(String email){
        try{
            RecUser saveUser = recUserService.getRecUser(email);
            if (saveUser != null){
                return ResultVOUtil.fail("该邮箱已经被使用！请换个邮箱!");
            }
            String content = UUID.randomUUID().toString().substring(0, 4);
            RecEmail recEmail = new RecEmail();
            recEmail.setEmail(email);
            recEmail.setCode(content);
            recEmail.setSendTime(new Date());
            recEmail.setIsConfirm("N");
            recUserService.saveRecEmail(recEmail);
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("1610424323@qq.com");
            message.setTo(email);
            message.setSubject("主题：验证邮件！");
            message.setText(content);
            javaMailSender.send(message);
        }catch (Exception e){
            e.printStackTrace();
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"邮箱验证码发送失败");
        }
        return ResultVOUtil.success();
    }

}
