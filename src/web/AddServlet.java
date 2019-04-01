package web;

import bean.Pers;
import service.ITestService;
import service.impl.ITestServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    ITestService service=new ITestServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String id = request.getParameter("id");

       Pers pers= service.selectId(id);
       request.getSession().setAttribute("pers",pers);
      request.getRequestDispatcher("/jsp/add.jsp").forward(request,response);
    }
}
