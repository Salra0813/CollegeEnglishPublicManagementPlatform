package sicnu.sixteam.englishbackstage.service.Impl;

import org.springframework.stereotype.Service;
import sicnu.sixteam.englishbackstage.mapper.UserMapper;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.LoginService;
import sicnu.sixteam.englishbackstage.service.UserService;

@Service
public class LoginServiceImpl implements LoginService {

    private UserServiceImpl userServiceimpl;
    @Override
    public User checkuser(String loginid, String password) {
        if (password == userServiceimpl.getUserPasswordByPhone(loginid))


        return null;
    }
}
