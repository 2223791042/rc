package guet.hxm.rc.controller;

import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.entity.Inform;
import guet.hxm.rc.entity.OpenAcademic;
import guet.hxm.rc.entity.User;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.InformService;
import guet.hxm.rc.service.NewsService;
import guet.hxm.rc.service.OpenAcademicService;
import guet.hxm.rc.service.UserService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @Autowired
    private OpenAcademicService openAcademicService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private InformService informService;

    //查看个人信息
    @GetMapping("/personalInfo")
    public String personalInfo(HttpSession httpSession, Model model){
        String loginUser = httpSession.getAttribute("loginUser").toString();
        User user = userService.getUser(loginUser);
        model.addAttribute("user", user);
        return "personalInfo";
    }
//修改密码
    @GetMapping("/changePwd")
    public String changePwd(){
        return "changePwd";
    }

    @ResponseBody
    @PutMapping("/changePwd")
    public ResultVO changePwd(String oldPassword, String newPassword, HttpSession httpSession){
        String loginUser = httpSession.getAttribute("loginUser").toString();
        User user = userService.getUser(loginUser);
        if (!user.getPassword().equals(oldPassword))
            return ResultVOUtil.fail("原密码错误");
        try{
            user.setPassword(newPassword);
            userService.editUser(user);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("修改密码失败");
        }
    }
//登录
    @ResponseBody
    @PostMapping(value = "/login")
    public ResultVO login(User user,String verifyCode, HttpSession session){
        String saveVerifyCode = (String) session.getAttribute("verifyCode");
        if (saveVerifyCode.toUpperCase().equals(verifyCode.toUpperCase())){
            User saveUser = userService.getUser(user.getUsername(),user.getUserType());
            if(saveUser == null){
                return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"用户名不存在");
            }else if(saveUser.getPassword().equals(user.getPassword())){
                session.setAttribute("loginUser", user.getUsername());
                session.setAttribute("userType", saveUser.getUserType());
                User lastUser = userService.getUser(user.getUsername());
                lastUser.setLoginCount(lastUser.getLoginCount() + 1);
                lastUser.setLoginTime(new Date());
                userService.editUser(lastUser);
                return ResultVOUtil.success();
            }else{
                return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"密码错误");
            }
        }
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"验证码错误");
    }

    /**
     * 登录页面
     * @return
     */
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/welcome")
    public String home(HttpSession session, Model model){
        String loginUser = (String) session.getAttribute("loginUser");
        User user = userService.getUser(loginUser);
        Integer totalUser = userService.getCountUser();
        Integer totalDownload = openAcademicService.getCountOpenAcademic();
        Integer totalVisit = newsService.getCountNews() + informService.getCountInform();  //新闻的访客量和通知的访客量，构成整个网站的访客量。
        model.addAttribute("totalVisit", totalVisit);
        model.addAttribute("totalDownload", totalDownload);
        model.addAttribute("totalUser", totalUser);
        model.addAttribute("user", user);
        return "welcome";
    }

    /**
     * 主页页面
     * @return
     */
    @GetMapping("/index")
    public String index(HttpSession session){
        String userType = (String) session.getAttribute("userType");
        if (userType.equals("super"))
            return "index-super";
        if(userType.equals("normal"))
            return "index-normal";
        return null;
    }

    /**
     * 登录退出
     * @param session
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpSession session){
        String loginUser = (String) session.getAttribute("loginUser");
        User user = userService.getUser(loginUser);
        user.setLastLogin(user.getLoginTime());
        userService.editUser(user);
        session.removeAttribute("loginUser");
        session.invalidate();
        return "login";
    }

}
