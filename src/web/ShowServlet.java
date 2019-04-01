package web;

import bean.Pers;
import service.ITestService;
import service.impl.ITestServiceImpl;
import utils.pageBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowServlet extends HttpServlet {
    ITestService service=new ITestServiceImpl();
    pageBean page=new pageBean();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<Pers> list=service.selectAll();

        request.getSession().setAttribute("list",list);
        request.getRequestDispatcher("/jsp/show.jsp").forward(request,response);

    }
}
