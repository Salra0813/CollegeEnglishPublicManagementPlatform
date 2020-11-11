//package sicnu.sixteam.englishbackstage.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import sicnu.sixteam.englishbackstage.model.User;
//
//import java.util.List;
//import java.util.Map;
//
//public interface UserDao {
//
////    @Query(value = "select * from usr where userid=?1", nativeQuery = true)
////    User findUserByUserid(String userid);
////
////    @Query(value = "select userid from usr", nativeQuery = true)
////    List<String> findAllUserId();
////
////    List<User> findAll();
//
//    List<Map<String,Object>> getAllUserId();
//
//    List<Map<String,Object>> getUserById(String userid);
//
//    //根据手机号查找密码
//    String getPasswdByPhone(String Phone);
//
//    //根据邮箱号查找密码
//    String getPasswdByEid(String Phone);
//
//
//}
