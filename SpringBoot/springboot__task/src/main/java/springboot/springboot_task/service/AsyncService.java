package springboot.springboot_task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author lifei
 * @date 2020/12/2 16:22
 */
@Service
public class AsyncService {

     //告诉spring这是一个异步方法
    @Async
    public void hello() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("处理数据中");
    }
}
