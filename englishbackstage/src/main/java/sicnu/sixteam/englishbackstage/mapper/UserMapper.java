package sicnu.sixteam.englishbackstage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sicnu.sixteam.englishbackstage.model.User;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    List<String> getAllUserId();

    User getUserById(@Param("userid") String userid);

    void InsertNewUserByEmail(@Param("username") String username,@Param("emailnum") String emailnum,@Param("password") String password);

    void InsertNewUserByPhone(@Param("username") String username,@Param("phonenum") String phonenum,@Param("password") String password);



//    //根据手机号查找密码
//    String getPasswdByPhone(@Param("Phone") String Phone);
//
//    //根据邮箱号查找密码
//    String getPasswdByEid(@Param("email") String email);

}
