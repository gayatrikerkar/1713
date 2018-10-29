package Pojo;

import java.io.Serializable;

public class Student implements Serializable {
private Integer roll_no;
private String name;
private String class_name;

public Integer getRoll_no() {
	return roll_no;
}
public void setRoll_no(Integer roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClass_name() {
	return class_name;
}
public void setClass_name(String class_name) {
	this.class_name = class_name;
}
public Student(Integer roll_no, String name, String class_name) {
	this.roll_no = roll_no;
	this.name = name;
	this.class_name = class_name;
}

public Student() {
	roll_no = 0;
	name = "";
	class_name = ""
			;
}

}
