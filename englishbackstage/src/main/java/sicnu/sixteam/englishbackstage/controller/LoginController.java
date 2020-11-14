package sicnu.sixteam.englishbackstage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.LoginService;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//用户登录接口s
@Controller
public class LoginController {

    @Resource
    private LoginService loginService;
    private User user;
    /**
     *
     * @param loginid                    //用于登录的用户信息（邮箱，手机号）
     * @param password                   //用户密码
     */
    @RequestMapping(value = "/login",method = POST)
    @ResponseBody
    private int RegisterByEmail(String loginid,String password) {
        user = loginService.checkuser(loginid,password);
        if (user != null)
            return 0;                                                //登录成功返回0
        return -1;                                                   //登录失败返回-1
    }
}

