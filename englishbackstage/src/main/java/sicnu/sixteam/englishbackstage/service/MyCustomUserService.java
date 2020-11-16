//package sicnu.sixteam.englishbackstage.service;
//
////import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import sicnu.sixteam.englishbackstage.model.User;
//
//import javax.annotation.Resource;
//
///**
// * 登录专用类
// * 自定义类，实现了UserDetailsService接口，用户登录时调用的第一类
// * @author 程就人生
// *
// */
//@Component
//public class MyCustomUserService implements UserDetailsService {
//    @Resource
//    private UserService userService;
//    /**
//     * 登陆验证时，通过username获取用户的所有权限信息
//     * 并返回UserDetails放到spring的全局缓存SecurityContextHolder中，以供授权器使用
//     */
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        //在这里可以自己调用数据库，对username进行查询，看看在数据库中是否存在
//
////        User user=new User();
////        user.setPhone(username);
////
////        user.setPasswd(userService.getUserPasswordByPhone(username));
//        MyUserDetails myUserDetail = new MyUserDetails();
//        myUserDetail.setUsername(username);
////        userService.getUserByPhone(username).getStatus();
////        myUserDetail.setAuthorities();
//        myUserDetail.setPassword(userService.getUserPasswordByPhone(username));
//        return myUserDetail;
//    }
//}