package springboot.springboot_data_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.springboot_data_mybatis.bean.Employee;
import springboot.springboot_data_mybatis.mapper.employeeMapper;

/**
 * @author lifei
 * @date 2020/11/29 9:39
 */

@RestController
public class employeeController {


    @Autowired
   employeeMapper employeeMapper;

    @GetMapping("/emp/{eid}")
    public Employee getEmpById(@PathVariable("eid") Integer eid){
       return employeeMapper.getEmpById(5);
    }


}
