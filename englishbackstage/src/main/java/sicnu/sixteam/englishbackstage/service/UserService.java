package sicnu.sixteam.englishbackstage.service;

import sicnu.sixteam.englishbackstage.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUserId();

    User getUserById(String userid);
//
//    //根据手机号查找密码
//    String getPasswdByPhone(String Phone);
//
//    //根据邮箱号查找密码
//    String getPasswdByEid(String email);

}
