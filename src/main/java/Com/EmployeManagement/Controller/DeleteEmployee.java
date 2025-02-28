package Com.EmployeManagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.EmployeManagement.Service.EmployeeService;

@WebServlet("/delete")
public class DeleteEmployee extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String ids=req.getParameter("id");
  int id=Integer.parseInt(ids);	
  
  EmployeeService empService=new EmployeeService();
  int res=empService.delete(id);
  if (res!=0) {
	RequestDispatcher rsdp=req.getRequestDispatcher("welcome.html");
	rsdp.include(req, resp);
	
}
}
}