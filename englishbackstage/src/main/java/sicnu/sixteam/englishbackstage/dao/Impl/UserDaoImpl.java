//package sicnu.sixteam.englishbackstage.dao.Impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import sicnu.sixteam.englishbackstage.dao.UserDao;
//import sicnu.sixteam.englishbackstage.model.User;
//
//import java.util.List;
//import java.util.Map;
//@Controller
//@ResponseBody
//public class UserDaoImpl implements UserDao {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @RequestMapping("/getUserById")
//    @Override
//    public List<Map<String,Object>> getUserById(String userid) {
//        String sql="select * from usr where userid=?;";
//        List<Map<String,Object>> list_maps = jdbcTemplate.queryForList(sql,userid);
//        return list_maps;
//    }
//
//    @RequestMapping("/getAllUserId")
//    @Override
//    public List<Map<String,Object>> getAllUserId() {
//        String sql="select userid from usr;";
//        List<Map<String,Object>> AllUserId = jdbcTemplate.queryForList(sql);
//        return AllUserId;
//    }
//
//    @RequestMapping("/getPasswdByPhone")
//    @Override
//    public String getPasswdByPhone(String Phone) {
//        return null;
//    }
//
//    @RequestMapping("/getPasswdByEid")
//    @Override
//    public String getPasswdByEid(String Phone) {
//        return null;
//    }
//}
