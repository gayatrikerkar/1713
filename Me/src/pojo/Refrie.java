package pojo;

public class Refrie {
private Integer age;
private String name;
private String nationality;


public void foul()
{
	System.out.println("foul method");
}

public void allowSubstitution()
{
	System.out.println("allowSubstitution method");
}

public void timeTrack()
{
	System.out.println("timeTrack methods");
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}
public Refrie()
{
age = 0;
name = "";
nationality = "";
}

public Refrie(Integer age, String name, String nationality) {
	this.age = age;
	this.name = name;
	this.nationality = nationality;
}

}