package cn.com.yzton.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 过滤器
 * 因为是基于servlet3.x版本的 过滤器，所以要用注解
 */
@WebFilter(urlPatterns = "/Ufida/*", filterName = "eapUserFilter")
@Slf4j
public class EapUserFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //过滤
//        //获取ServletContext对象，用来记录日志
//        ServletContext context = this.filterConfig.getServletContext();
        log.info("开始过滤");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        log.info("获取客户端请求地址：" + request.getContextPath());

        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (!username.equals(null)) {
            //放行
            filterChain.doFilter(servletRequest, servletResponse);
            log.info("过滤结束");
            //再次请求地址
            log.info("再次请求地址：" + request.getRequestURI());
        } else {
            log.info("拦截");
            response.sendRedirect("/pages/login.html");
            return;
        }

    }

    @Override
    public void destroy() {
        //销毁
        this.filterConfig = null;
    }
}
