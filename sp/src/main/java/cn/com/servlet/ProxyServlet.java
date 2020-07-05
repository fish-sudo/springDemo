package cn.com.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 代理servelt
 */
public class ProxyServlet extends HttpServlet {
    private Servlet proxy;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proxy.service(req, resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
        //根据servlet和spring配置同名来进入不同的servlet
        System.out.println(config.getServletName());
        proxy = context.getBean(config.getServletName(),Servlet.class);
        proxy.init(config);
    }

    @Override
    public void destroy() {
        proxy.destroy();
    }
}
