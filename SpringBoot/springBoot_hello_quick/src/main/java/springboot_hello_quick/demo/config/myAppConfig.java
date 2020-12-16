package springboot_hello_quick.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot_hello_quick.demo.service.helloService;

/**
 * @author lifei
 * @date 2020/11/19 14:42
 */


/**
 * @Configuration:指明当前类是一个配置类，就是来替代之前的Spring配置文件
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class myAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public helloService helloService(){
        return new helloService();
    }
}
