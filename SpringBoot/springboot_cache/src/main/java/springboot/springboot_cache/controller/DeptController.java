package springboot.springboot_cache.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.springboot_cache.bean.Department;
import springboot.springboot_cache.service.DeptService;

@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

//    @GetMapping("/dept/{id}")
//    public Department getDept(@PathVariable("id") Integer id){
//        return deptService.getDeptById(id);
//    }
}
