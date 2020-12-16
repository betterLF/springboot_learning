package springboot_web.springboot_web.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author lifei
 * @date 2020/11/24 10:26
 */
/*
可以在链接上携带区域信息
 */
public class MyLocaleResolver implements LocaleResolver {


    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String parameter = httpServletRequest.getParameter("l");
        Locale locale=Locale.getDefault();
        if(!StringUtils.isEmpty(parameter)){
            String[] s = parameter.split("_");
           locale = new Locale(s[0],s[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
