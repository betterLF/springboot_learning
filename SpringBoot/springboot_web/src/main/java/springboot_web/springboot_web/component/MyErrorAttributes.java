package springboot_web.springboot_web.component;

import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

//给容器中加入我们自己定义的ErrorAttributes
//@Component
//public class MyErrorAttributes extends DefaultErrorAttributes {
//
//    //返回值的map就是页面和json能获取的所有字段
//    @Override
//    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
//        Map<String, Object> map = super.getErrorAttributes(requestAttributes, includeStackTrace);
//        map.put("company","atguigu");
//
//        //我们的异常处理器携带的数据
//        Map<String,Object> ext = (Map<String, Object>) requestAttributes.getAttribute("ext", 0);
//        map.put("ext",ext);
//        return map;
//    }
//}
