package Com.EmployeManagement.Controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.EmployeManagement.Entity.Employee;
import Com.EmployeManagement.Service.EmployeeService;


@WebServlet("/submit")
public class EditEmployee extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String age=req.getParameter("age");
	String email=req.getParameter("email");
	String salaray=req.getParameter("salary");
	
	int ids=Integer.parseInt(id);
	int agess=Integer.parseInt(age);
	int salarys=Integer.parseInt(salaray);
	
	Employee e=new Employee(ids, name, agess, email, salarys);
	
	EmployeeService empService=new EmployeeService();
	int res=empService.update(e);
	if (res!=0) {
		RequestDispatcher rsdp=req.getRequestDispatcher("welcome.html");
		
		rsdp.forward(req, resp);
	}
}
}