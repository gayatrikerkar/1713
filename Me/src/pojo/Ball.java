package pojo;

public class Ball {
private Integer sizee;
private Integer weight;
private String color;
private String brand;


public Integer getWeight() {
	return weight;
}
public void setWeight(Integer weight) {
	this.weight = weight;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Ball()
{
	sizee = 0;
	weight = 0;
	color = "";
	brand = "";
}

public Ball(Integer size, Integer weight, String color, String brand) {
	this.sizee = size;
	this.weight = weight;
	this.color = color;
	this.brand = brand;
}
public Integer getSizee() {
	return sizee;
}
public void setSizee(Integer sizee) {
	this.sizee = sizee;
}


}
