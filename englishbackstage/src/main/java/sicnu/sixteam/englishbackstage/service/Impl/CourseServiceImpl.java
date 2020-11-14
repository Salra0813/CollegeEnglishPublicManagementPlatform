package sicnu.sixteam.englishbackstage.service.Impl;


import org.springframework.stereotype.Service;
import sicnu.sixteam.englishbackstage.mapper.CourseMapper;
import sicnu.sixteam.englishbackstage.model.Course;
import sicnu.sixteam.englishbackstage.service.CourseService;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "CourseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<String> getAllCourseId() {
        return courseMapper.getAllCourseId();
    }

    @Override
    public Course getCourseBycid(String cid) {
        return courseMapper.getCourseByCid(cid);
    }

//    @Override
//    public void insertCourse(String cname, String cintrod, String cschool, String tname, String tintrod) {
//        courseMapper.insertCourse(cname,cintrod,cschool,tname,tintrod);
//    }
}
