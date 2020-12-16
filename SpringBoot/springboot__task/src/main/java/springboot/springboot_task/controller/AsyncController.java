package springboot.springboot_task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.springboot_task.service.AsyncService;

/**
 * @author lifei
 * @date 2020/12/2 16:23
 */

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        asyncService.hello();
        return "success";
    }
}
