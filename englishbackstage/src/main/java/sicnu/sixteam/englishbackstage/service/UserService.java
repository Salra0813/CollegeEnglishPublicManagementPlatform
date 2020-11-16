package sicnu.sixteam.englishbackstage.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import sicnu.sixteam.englishbackstage.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<String> getAllUserId();

    User getUserById(String userid);

    void InsertNewUserByEmail(String username,String emailnum,String password);


    void InsertNewUserByPhone(String username,String emailnum,String password);

    String getUserPasswordByPhone(String phonenum);

    String getUserPasswordByEmail(String emailnum);

    User getUserByPhone(String phonenum);

    List<String> getPermissionsByPhone(String phonenum);
//    //根据手机号查找密码
//    String getPasswdByPhone(String Phone);
//
//    //根据邮箱号查找密码
//    String getPasswdByEid(String email);

}
