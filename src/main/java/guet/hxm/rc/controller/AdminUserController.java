package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.User;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.UserService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminUserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String user(){
        return "user-list";
    }

    @ResponseBody
    @GetMapping("/userList")
    public TableListVO<User> listData(int page, int limit, HttpServletRequest request) {
        PageHelper.startPage(page, limit);
        String username = request.getParameter("username");
        String userType = request.getParameter("userType");
        List<User> userList = userService.getUserList(username, userType);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return new TableListVO<>(pageInfo.getTotal(), pageInfo.getList());
    }

    @ResponseBody
    @DeleteMapping("/user/{userId}")
    public ResultVO user(@PathVariable("userId")Long userId){
        try {
            userService.delUser(userId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }

    @GetMapping("/userAdd")
    public String userAdd(){
        return "user-add";
    }

    @GetMapping("/user/{userId}")
    public String userEdit(@PathVariable("userId")Long userId,Model model){
        User user = userService.getUser(userId);
        model.addAttribute("user", user);
        return "user-edit";
    }

    @GetMapping("/user/repd/{userId}")
    public String userRepd(@PathVariable("userId")Long userId,Model model){
        User user = userService.getUser(userId);
        model.addAttribute("user", user);
        return "user-repd";
    }

    @ResponseBody
    @PutMapping("/userEdit")
    public ResultVO userEdit(User user){
        try {
            userService.editUser(user);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "修改失败");
        }
    }

    @ResponseBody
    @GetMapping("/user/checkUsername/{username}")
    public ResultVO checkUsername(@PathVariable("username") String username){
        User user = userService.getUser(username);
        if(user != null){
            ResultVO resultVO = new ResultVO();
            resultVO.setCode(0);
            return resultVO;
        }
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        return resultVO;
    }

    //添加用户
    @ResponseBody
    @PostMapping("/user")
    public ResultVO user(User user){
        try{
            user.setLastLogin(new Date());
            user.setAddTime(new Date());
            user.setLoginCount(0);
            userService.saveUser(user);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
        }
    }
}
