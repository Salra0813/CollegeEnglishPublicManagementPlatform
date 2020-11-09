package sicnu.sixteam.englishbackstage.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import sicnu.sixteam.englishbackstage.dao.Impl.UserDaoImpl;
import sicnu.sixteam.englishbackstage.dao.UserDao;
import sicnu.sixteam.englishbackstage.model.User;
import sicnu.sixteam.englishbackstage.service.UserService;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
//
//    @Override
//    public void registUser(User user) {
//        userDao.saveUser(user);
//    }
//
//    @Override
//    public void changePassword(User user){
//        userDao.updateUserPassword(user);
//    }
//    @Override
//    public User login(User user) {
//        /**
//         * 咱们的登录，只是需要查询数据库即可！！！
//         *
//         */
//        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
//    }
//
//    @Override
//    public boolean existsUsername(String username) {
//
//        if (userDao.queryUserByUsername(username) == null) {
//            // 等于null,说明没查到，没查到表示可用
//            return false;
//        }
//
//        return true;
//
//    }
//}


}
