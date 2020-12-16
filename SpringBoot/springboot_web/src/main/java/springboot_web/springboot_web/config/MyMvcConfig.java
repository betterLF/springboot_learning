package springboot_web.springboot_web.config;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springboot_web.springboot_web.component.LoginHandlerInterceptor;
import springboot_web.springboot_web.component.MyLocaleResolver;

/**
 * @author lifei
 * @date 2020/11/23 13:05
 */
//使用WebMvcConfigurerAdapter可以扩展SpringMVC的功能
//@EnableWebMvc 加上该注解，springboot的自动配置都失效了，即首页等静态资源不能访问了
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
public void addViewControllers(ViewControllerRegistry registry){
        //浏览器发送/hi请求来到success页面
        registry.addViewController("/hi").setViewName("success");
    }

    //所有的WebMvcConfigurerAdapter都会一起起作用
    @Bean  //将组件注册在容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry){
                //浏览器发送/hi请求来到success页面
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //注册拦截器,防止表单重复提交
            @Override
            public void addInterceptors(InterceptorRegistry registry){
                //静态资源，*.css，*.js，springBoot已经做好了静态资源映射
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
//                        excludePathPatterns("/index.html","/","/user/login");
            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

//    //配置嵌入式的Servlet容器
//    @Bean
//    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
//        return new EmbeddedServletContainerCustomizer() {
//            //定制嵌入式的Servlet容器相关的规则
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                container.setPort(8083);
//            }
//        };
//    }

}
