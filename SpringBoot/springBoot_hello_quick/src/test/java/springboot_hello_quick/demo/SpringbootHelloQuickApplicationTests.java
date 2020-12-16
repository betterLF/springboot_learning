package springboot_hello_quick.demo;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import springboot_hello_quick.demo.bean.Person;
import springboot_hello_quick.demo.service.helloService;

import java.util.function.Supplier;

/**
 * SpringBoot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@SpringBootTest
class SpringbootHelloQuickApplicationTests {

    @Autowired
    Person person;

 
    @Autowired
    ApplicationContext ioc;

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void testHelloService(){
      boolean b=ioc.containsBean("helloService");
        System.out.println(b);
    }
    @Test
    void contextLoads() {
        //System.out.println(person)
        String s=new String();
        //日志级别:
        //由低到高:trace<debug<info<warn<error
        //可以调整需要输出的日志级别,日志就只会在这个级别以后的高级别生效
        //SpringBoot日志级别默认为info级别，可以在配置文件中调整
        //logging.level.springboot_hello_quick=trace
        //logging.path=
        //不指定路径在当前项目下生成springboot.log日志
        //可以指定完整的路径:
        //logging.file=G:/springboot.log
        //在当前磁盘的根路径下创建spring文件夹和里面的log文件夹，使用spring.log作为默认文件
        //logging.path=/spring/log
        logger.trace(new Supplier<String>() {
            @Override
            public String get() {
                return "这是trace日志";
            }
        });
        logger.debug(new Supplier<String>() {
            @Override
            public String get() {
                return "这是debug日志";
            }
        });
        logger.info(new Supplier<String>() {
            @Override
            public String get() {
                return "这是info日志";
            }
        });
        logger.warn(new Supplier<String>() {
            @Override
            public String get() {
                return "这是warn日志";
            }
        });
        logger.error(new Supplier<String>() {
            @Override
            public String get() {
                return "这是error日志";
            }
        });
    }

}
