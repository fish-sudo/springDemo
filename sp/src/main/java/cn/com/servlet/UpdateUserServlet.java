package cn.com.servlet;

import cn.com.bean.UserBean;
import cn.com.service.UserInfoService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 修改用户servelt
 */
@Component
public class UpdateUserServlet extends HttpServlet {
    @Resource
    private UserInfoService userInfoService;
    @Resource
    private UserBean bean;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        if (req.getParameter("id") !=  null) {
            bean.setId(Integer.valueOf(req.getParameter("id")));
        }
        if(req.getParameter("name") != null){
            bean.setName(req.getParameter("name"));
        }
        if(req.getParameter("sex") != null){
            bean.setSex(req.getParameter("sex"));
        }
        if(req.getParameter("email") != null){
            bean.setEmail(req.getParameter("email"));
        }
        if(req.getParameter("brithdat") != null){
            bean.setBrithdat(req.getParameter("brithdat"));
        }
        if(userInfoService.updateUser(bean)){
            resp.getWriter().println("修改成功");
        }else{
            resp.getWriter().println("修改失败");
        }
    }
}
