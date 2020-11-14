package sicnu.sixteam.englishbackstage.service;

import org.apache.ibatis.annotations.Param;
import sicnu.sixteam.englishbackstage.model.Course;

import java.util.List;

public interface CourseService {

    List<String> getAllCourseId();

    Course getCourseBycid(String cid);

//    void insertCourse(String cname, String cintrod,String cschool, String tname, String tintrod);

}
