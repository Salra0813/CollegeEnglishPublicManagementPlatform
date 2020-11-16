package sicnu.sixteam.englishbackstage.controller;


import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sicnu.sixteam.englishbackstage.model.Course;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.CourseService;
import sicnu.sixteam.englishbackstage.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
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

    @RequestMapping("/getUserByPhone")
    @ResponseBody
    private User getUserByPhone(String phonenum){return userService.getUserByPhone(phonenum);}



    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "Hello,Spring security";
    }

    @ResponseBody
    @RequestMapping("admin")
    public String roleAdmin(){
        return "Hello,我是 admin才能访问的";
    }


    @ResponseBody
    @RequestMapping("normal")
    public String roleNormal(){
        return "Hello,我是Normal和admin都可以访问的";
    }

    @ResponseBody
    @RequestMapping("user")
    public String toUser(){
        return "Hello,只要是用户都可以访问我";
    }

    @ResponseBody
    @RequestMapping("ano")
    public String anonymous(){
        return "Hello,匿名用户可以访问我";
    }

    /**
     * 在处理之后,对数据进行过滤一遍,PostFilter里面用的SpEL表达式
     * @return
     */
    @PostFilter("filterObject.lastIndexOf('2')!=-1")
    @RequestMapping("list")
    public List<String> listUser(){
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("aboysky:" + i);
        }
        return users;
    }

    /**
     * 请求中age参数必须大于98的才能访问
     * @param age
     * @return
     */
    @PreAuthorize("#age>98")
    @RequestMapping("getage")
    public String getAge(Integer age) {
        return String.valueOf(age);
    }

    /**
     * 将访问参数ages集合在处理之前过滤一遍
     * @param ages
     * @return
     */
    @PreFilter(filterTarget = "ages",value = "filterObject%2==0")
    @RequestMapping("ages")
    public String getAllAge(List<Integer> ages) {
        System.out.println("ages = " + ages);
        return Arrays.toString(ages.toArray());
    }

}
