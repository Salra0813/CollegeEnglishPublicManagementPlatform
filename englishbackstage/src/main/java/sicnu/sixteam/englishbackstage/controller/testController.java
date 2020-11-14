package sicnu.sixteam.englishbackstage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sicnu.sixteam.englishbackstage.model.Course;
import sicnu.sixteam.englishbackstage.service.CourseService;
import sicnu.sixteam.englishbackstage.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class testController {

    @Resource
    private CourseService courseService;

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getAllCourseId")
    private List<String> getAllCourseId(){
        return courseService.getAllCourseId();
    }

    @ResponseBody
    @RequestMapping("/getCourseByCid")
    private Course getCourseByCid(String cid){
         return  courseService.getCourseBycid(cid);
    }

    @ResponseBody
    @RequestMapping("/getUserPasswordByPhone")
    private String getUserPasswordByPhone(String phonenum){
        return  userService.getUserPasswordByPhone(phonenum);
    }

    @ResponseBody
    @RequestMapping("/getUserPasswordByEmail")
    private String getUserPasswordByEmail(String emailnum){
        return  userService.getUserPasswordByEmail(emailnum);
    }

}
