package sicnu.sixteam.englishbackstage.service.Impl;



import org.springframework.stereotype.Service;

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
