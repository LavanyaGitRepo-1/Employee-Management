package Com.EmployeManagement.Entity;

public class Employee {
private int id;
private String name;
private int age;
private String emailid;
private int salary;



public Employee() {

}
public Employee(int id, String name, int age, String emailid, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.emailid = emailid;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
