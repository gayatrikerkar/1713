package pojo;

public class Stadium {
private Integer areas;
private Integer capacity;
private String name;
private String location;

public Integer getCapacity() {
	return capacity;
}
public void setCapacity(Integer capacity) {
	this.capacity = capacity;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Stadium()
{
areas = 0;
capacity = 0;
name = "";
location = "";
}

public Stadium(Integer area, Integer capacity, String name, String location) {
	this.areas = area;
	this.capacity = capacity;
	this.name = name;
	this.location = location;
}
public Integer getAreas() {
	return areas;
}
public void setAreas(Integer areas) {
	this.areas = areas;
}



}
