package springboot_web.springboot_web.component;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lifei
 * @date 2020/11/24 18:38
 */
/*
登录检查
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    //目标方法执行之前
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      Object loginUser = request.getSession().getAttribute("loginUser");
      if(loginUser==null){
          //未登录，返回登录页面
          request.setAttribute("msg","没有权限请先登录");
          request.getRequestDispatcher("/index.html").forward(request,response);
          return false;
      }else {
          //已登录，放行请求
          return true;
      }
    }

  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }

}
