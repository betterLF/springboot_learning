package springboot.springboot_data_mybatis.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.springboot_data_mybatis.bean.course;
import springboot.springboot_data_mybatis.mapper.courseMapper;

import java.util.List;

/**
 * @author lifei
 * @date 2020/11/29 9:07
 */

@RestController
public class courseController {

    @Autowired
    courseMapper courseMapper;

    @GetMapping("/course/{studentId}")
    public List<course> getCourse(@PathVariable("studentId") String studentId){
        return courseMapper.getCourseById(studentId);
    }


//    @DeleteMapping("/course/{studentId}")
//    public void deleteCourse(@PathVariable("studentId") String studentId){
//        courseMapper.deleteCourseById(studentId);
//    }
}
