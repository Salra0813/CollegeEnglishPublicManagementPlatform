package sicnu.sixteam.englishbackstage.service.Impl;



import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import sicnu.sixteam.englishbackstage.mapper.UserMapper;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


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
