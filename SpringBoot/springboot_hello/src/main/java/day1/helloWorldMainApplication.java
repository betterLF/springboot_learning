package day1;

/**
 * @author lifei
 * @date 2020/11/18 8:55
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个springBoot应用
 */

/**
 * @SpringBootConfiguration：SpringBoot配置类
 *    标注在某个类中，表示这是一个SpringBoot的配置类
 *    @Configuration:配置类上来标注这个注解
 *    配置类----配置文件；配置类也是容器中的一个组件；@Component
 *
 * @EnableAutoConfiguration：开启自动配置功能
 *    以前我们需要配置的东西，SpringBoot帮我们自动配置，@EnableAutoConfiguration告诉SpringBoot开启自动配置功能；这样自动配置才能生效
 *
 *    @AutoConfigurationPackage:自动配置包
 *        @Import({Registrar.class})：Spring的底层注解@Import，给容器导入一个组件；导入的组件由
 *        Registrar.class；
 *        将主配置类（@SpringBootApplication标注的类）所在的包及下面所有子包里面的所有组件扫描到Spring容器
 *
 *    @Import({EnableAutoConfigurationImportSelector.class})：给容器中导入组件，导入哪些组件的选择器；将所有
 *    需要导入的组件以全类名的方式返回这些组件就会被添加到容器中。会给容器中导入非常多的自动配置类（xxxAutoConfiguration
 *    ）；就是给容器中导入这个场景需要的所有组件，并配置好这些组件。有了这些自动配置类，免去了我们手动编写配置注入功能组件等功能
 *
 *    public @interface EnableAutoConfiguration {
 */
@SpringBootApplication
public class helloWorldMainApplication {
    public static void main(String[] args) {
        //Spring 应用启动起来
        SpringApplication.run(helloWorldMainApplication.class,args);

    }
}
