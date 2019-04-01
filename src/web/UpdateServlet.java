package web;

import bean.Pers;
import bean.Sex;
import service.ITestService;
import service.impl.ITestServiceImpl;
import utils.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UpdateServlet extends HttpServlet {
    ITestService service=new ITestServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> map = request.getParameterMap();
        Pers pers = JdbcUtil.toBean(Pers.class, map);
        int i=service.updateId(pers);
        response.sendRedirect("/index.jsp");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        Pers pers= service.selectId(id);
        List<Sex> sexs=service.sexAll();
        request.getSession().setAttribute("sexs",sexs);
        request.getSession().setAttribute("pers",pers);
        request.getRequestDispatcher("/jsp/update.jsp").forward(request,response);
    }

}
