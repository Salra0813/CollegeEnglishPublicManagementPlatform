package sicnu.sixteam.englishbackstage.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import sicnu.sixteam.englishbackstage.model.Course;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {


    List<String> getAllCourseId();

    Course getCourseByCid(@Param("cid") String cid);

//    void insertCourse(@Param("cname") String cname,@Param("cintrod") String cintrod,@Param("cshool") String cschool,@Param("tname")String tname,@Param("tintrod")String tintrod);

}
