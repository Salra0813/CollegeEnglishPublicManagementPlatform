package sicnu.sixteam.englishbackstage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.Impl.UserServiceImpl;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

//用户登录接口
@Controller
@RequestMapping(value = "/Register")
public class RegisterController {

    @Resource
    private UserServiceImpl userServiceimpl;
    private User user = null;
    /**
     *
     * @param phonenum                    //用于登录的用户信息（邮箱，手机号）
     * @param password                   //用户密码
     */
    @RequestMapping(value = "/isRegister",method = POST)
    @ResponseBody
    private int RegisterByEmail(String phonenum,String password) {
        user = userServiceimpl.getUserByPhone(phonenum);
        if (user != null){
            if (user.getPasswd().equals(password))
                return 1;                                    //登录成功
            else{
                user = null;
                return 0;                                   //密码错误
            }
        }
        return -1;                                         //该用户不存在
    }

    /**
     * 获取登录成功的用户类
     */
    @RequestMapping(value = "/getRegisteruser",method = GET)
    @ResponseBody
    private User getUser() {
        return this.user;
    }

}

