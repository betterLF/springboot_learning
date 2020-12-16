package springboot_hello_quick.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * @ImportResource:导入Spring的配置文件，让配置文件里面的内容生效
 * SpringBoot里面没有Spring的配置文件，我们自己编写的配置文件，也不能自动识别
 * 想让Spring的配置文件生效，加载@ImportResource注解,可以导入Spring配置文件
 * 但是该方法不推荐
 *
 * SpringBoot推荐使用全注解模式，config.myAppConfig
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringbootHelloQuickApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootHelloQuickApplication.class, args);
    }

}
