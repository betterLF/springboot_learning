package springboot.springboot_data_mybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import springboot.springboot_data_mybatis.bean.course;

import java.util.List;

/**
 * @author lifei
 * @date 2020/11/29 9:02
 */

//指定这是一个操作数据库的mapper
//注解版模式
//@Mapper  可以不需要这个注解，在启动类中添加MapperScan注解扫描所有mapper包
public interface courseMapper {

   @Select("select * from course where studentId=#{studentId}")
    public List<course> getCourseById(String studentId);

    @Delete("delete from course where studentId=#{studentId}")
    public int deleteCourseById(String studentId);
}
