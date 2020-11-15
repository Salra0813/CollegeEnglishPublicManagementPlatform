package sicnu.sixteam.englishbackstage.service;

import sicnu.sixteam.englishbackstage.model.User;

//用户登录接口
public interface LoginService {
    User checkuser(String phonenum, String password);
}

