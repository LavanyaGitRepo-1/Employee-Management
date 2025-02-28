package Com.EmployeManagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.EmployeManagement.Entity.Employee;
import Com.EmployeManagement.Service.EmployeeService;

@WebServlet("/register")
public class SaveEmployee  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  PrintWriter pr=resp.getWriter();
  
  String id= req.getParameter("id");
  String name= req.getParameter("name");
  String age= req.getParameter("age");
  String email= req.getParameter("email");
   String salary=req.getParameter("salary");
   
   int ids=Integer.parseInt(id);
   int salarys = Integer.parseInt(salary);
   int ages=Integer.parseInt(age);
   
Employee e=new Employee();
e.setId(ids);
e.setName(name);
e.setAge(ages);
e.setEmailid(email);
e.setSalary(salarys);
EmployeeService empService=new EmployeeService();
int res=empService.save(e);
if (res!=0) {
	RequestDispatcher rs=req.getRequestDispatcher("welcome.html");
	rs.include(req, resp);
	   
}
else
{
	pr.print("<h1>Data not inserted</h1>");
	   
}

}
}