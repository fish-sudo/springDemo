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
import java.util.List;
/**
 * 查询所有用户servelt
 */
@Component
public class UserInfoServlet extends HttpServlet {
    @Resource
    private UserInfoService userInfoService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        List<UserBean> list = userInfoService.getAllUserInfo();
        for (UserBean bean : list) {
            resp.getWriter().println(bean);
        }
    }
}
