package sicnu.sixteam.englishbackstage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.UserService;

import javax.annotation.Resource;
import java.util.List;
@Controller
@RequestMapping(value = "/user")
public class GetUserByIdController {
    @Resource
    private UserService userService;


    @RequestMapping("/getAllUserId")
    @ResponseBody
    private List<User> getAllUserId() {
        List<User> users =  userService.getAllUserId();

        return users;

    }
    @RequestMapping("/getUserById")
    @ResponseBody
    private User getUserById(String userid) {
        return userService.getUserById(userid);
    }
}
