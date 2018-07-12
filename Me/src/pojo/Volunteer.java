package pojo;

public class Volunteer {
private String name;
private Integer age;


public void serveSupplements()
{
	System.out.println("serveSupplements method");
}
public void fieldWork()
{
	System.out.println("fieldWorkk method");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Volunteer()
{
age = 0;
name = "";
}
public Volunteer(String name, Integer age) {
	this.name = name;
	this.age = age;
}

}