package sicnu.sixteam.englishbackstage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sicnu.sixteam.englishbackstage.service.UserService;

import javax.annotation.Resource;
@Controller
public class RegisterController {

    @Resource
    private UserService userService;

    /**
     *
     * @param username
     * @param emailnum
     * @param password
     */
    @RequestMapping("/RegisterByEmail")
    @ResponseBody
    private void RegisterByEmail(String username,String emailnum,String password) {
         userService.InsertNewUserByEmail(username,emailnum,password);
    }

    /**
     *
     * @param username
     * @param phonenum
     * @param password
     */
    @RequestMapping("/RegisterByPhone")
    @ResponseBody
    private void RegisterByPhone(String username,String phonenum,String password) {
         userService.InsertNewUserByPhone(username,phonenum,password);
    }
}
