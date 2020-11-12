package sicnu.sixteam.englishbackstage.service;

import sicnu.sixteam.englishbackstage.model.User;

import java.util.List;

public interface UserService {
    List<String> getAllUserId();

    User getUserById(String userid);

    void InsertNewUserByEmail(String username,String emailnum,String password);


    void InsertNewUserByPhone(String username,String emailnum,String password);
//
//    //根据手机号查找密码
//    String getPasswdByPhone(String Phone);
//
//    //根据邮箱号查找密码
//    String getPasswdByEid(String email);

}
