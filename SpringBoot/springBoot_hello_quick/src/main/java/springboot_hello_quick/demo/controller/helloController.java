package springboot_hello_quick.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lifei
 * @date 2020/11/18 11:13
 */
//这个类的所有方法返回的数据直接写给浏览器，(如果是对象还能转成json数据)
//@ResponseBody
//@Controller
@RestController
public class helloController {

    //获取配置文件中的值
    //@Value("${person.last-name}")
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
    return "hello world quick"+name;
    }
}
