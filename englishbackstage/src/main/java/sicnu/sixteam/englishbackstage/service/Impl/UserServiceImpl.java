package sicnu.sixteam.englishbackstage.service.Impl;



import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sicnu.sixteam.englishbackstage.mapper.PermissionsMapper;
import sicnu.sixteam.englishbackstage.mapper.UserMapper;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private PermissionsMapper permissionsMapper;


    @Override
    public List<String> getAllUserId() {
        return userMapper.getAllUserId();
    }

    @Override
    public User getUserById(String userid) {
        return userMapper.getUserById(userid);
    }

    @Override
    public void InsertNewUserByEmail(String username, String emailnum, String password) {
            userMapper.InsertNewUserByEmail(username,emailnum,password);
    }

    @Override
    public void InsertNewUserByPhone(String username, String phonenum, String password) {
            userMapper.InsertNewUserByPhone(username,phonenum,password);
    }

    @Override
    public String getUserPasswordByPhone(String phonenum) {
        return userMapper.getUserPasswordByPhone(phonenum);
    }

    @Override
    public User getUserByPhone(String phonenum) {
        return userMapper.getUserByPhone(phonenum);
    }

    @Override
    public String getUserPasswordByEmail(String emailnum) {
        return userMapper.getUserPasswordByEmail(emailnum);
    }

    @Override
    public List<String> getPermissionsByPhone(String phonenum) {
        return permissionsMapper.getPermissionsByPhone(phonenum);
    }

    @Override
    public UserDetails loadUserByUsername(String phonenum) throws UsernameNotFoundException {
        User user = userMapper.getUserByPhone(phonenum);
        if (user!=null){
            //查询用户对应的角色,然后根据角色查询对应的权限

            List<String> permissions = this.getPermissionsByPhone(phonenum);
//
//            // 将对应的权限封装为所需要的类型
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            System.out.println(permissions);
            for (String permission : permissions) {
                authorities.add(new SimpleGrantedAuthority(permission));
            }
//            System.out.println(Arrays.toString(permissions.toArray()));
//            //根据用户状态判断是否可以登录
            return new org.springframework.security.core.userdetails.User(user.getPhone(),user.getPasswd(), user.getStatus().equals("ROLE_stu") || user.getStatus().equals("ROLE_tea")||user.getStatus().equals("ROLE_admin"),true,true,true, authorities);
        }
        return null;
    }

//    @Override
//    public String getPasswdByPhone(String Phone) {
//        return null;
//    }
//
//    @Override
//    public String getPasswdByEid(String email) {
//        return null;
//    }
}
