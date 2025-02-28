package Com.EmployeManagement.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.EmployeManagement.Entity.Employee;
import Com.EmployeManagement.Service.EmployeeService;


@WebServlet("/displays")
public class DisplayAll extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
EmployeeService empService=new EmployeeService();
List<Employee> emps=empService.fetchAll();
PrintWriter pr=resp.getWriter();
pr.print("<!DOCTYPE html>\r\n"
        + "<html lang=\"en\">\r\n"
        + "<head>\r\n"
        + "    <meta charset=\"UTF-8\">\r\n"
        + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
        + "    <title>Employee List</title>\r\n"
        + "    <style>\r\n"
        + "        body {\r\n"
        + "            font-family: Arial, sans-serif;\r\n"
        + "            background-color: #f0f0f0;\r\n"
        + "            text-align: center;\r\n"
        + "        }\r\n"
        + "        .container {\r\n"
        + "            width: 80%;\r\n"
        + "            margin: 20px auto;\r\n"
        + "        }\r\n"
        + "        h2 {\r\n"
        + "            color: #2a5298;\r\n"
        + "        }\r\n"
        + "        table {\r\n"
        + "            width: 100%;\r\n"
        + "            border-collapse: collapse;\r\n"
        + "            background-color: white;\r\n"
        + "        }\r\n"
        + "        th, td {\r\n"
        + "            padding: 10px;\r\n"
        + "            border: 1px solid #ccc;\r\n"
        + "            text-align: left;\r\n"
        + "        }\r\n"
        + "        th {\r\n"
        + "            background-color: #2a5298;\r\n"
        + "            color: white;\r\n"
        + "        }\r\n"
        + "        tr:nth-child(even) {\r\n"
        + "            background-color: #f9f9f9;\r\n"
        + "        }\r\n"
        + "        .btn {\r\n"
        + "            padding: 5px 10px;\r\n"
        + "            text-decoration: none;\r\n"
        + "            color: white;\r\n"
        + "            border-radius: 4px;\r\n"
        + "            transition: opacity 0.3s;\r\n"
        + "        }\r\n"
        + "        .btn-edit {\r\n"
        + "            background-color: #28a745;\r\n"
        + "        }\r\n"
        + "        .btn-edit:hover {\r\n"
        + "            background-color: #218838;\r\n"
        + "        }\r\n"
        + "        .btn-delete {\r\n"
        + "            background-color: #dc3545;\r\n"
        + "        }\r\n"
        + "        .btn-delete:hover {\r\n"
        + "            background-color: #c82333;\r\n"
        + "        }\r\n"
        + "    </style>\r\n"
        + "</head>\r\n"
        + "<body>\r\n"
        + "    <div class=\"container\">\r\n"
        + "        <h2>Employee Details</h2>\r\n"
        + "        <table>\r\n"
        + "            <thead>\r\n"
        + "                <tr>\r\n"
        + "                    <th>ID</th>\r\n"
        + "                    <th>Name</th>\r\n"
        + "                    <th>Age</th>\r\n"
        + "                    <th>Email</th>\r\n"
        + "                    <th>Salary</th>\r\n"
        + "                    <th>Actions</th>\r\n"
        + "                </tr>\r\n"
        + "            </thead>\r\n"
        + "            <tbody>");
for (Employee employe : emps) {
	int id=employe.getId();
	String name=employe.getName();
	int age=employe.getAge();
	String emailid=employe.getEmailid();
	int salary=employe.getSalary();
	
	 pr.print("<tr>\r\n"
             + "    <td>" + id + "</td>\r\n"
             + "    <td>" + name + "</td>\r\n"
             + "    <td>" + age + "</td>\r\n"
             + "    <td>" + emailid + "</td>\r\n"
             + "    <td>" + salary + "</td>\r\n"
             + "    <td>\r\n"
//             + "        <a href="+"EditForm.html"+">edit</a>\r\n"
//             + "        <a href="+"DeleteForm.html"+">delete</a>\r\n"
+ "<a href='EditForm.html' class='btn btn-edit'>Edit</a>\r\n"
+ "<a href='DeleteForm.html?id=" + id + "' class='btn btn-delete'>Delete</a>\r\n"

             + "    </td>\r\n"
             + "</tr>");
}

}
}



