package pojo;

public class Player {
private Integer weight;
private String name;
private Integer shoeNo;
private Integer jersieNo;
private String team;

public void kick()
{
	System.out.println("kick method");
	
}

public void scoreGoal()
{
	System.out.println("score goal method");
	
}

public void run()
{
	System.out.println("run method");
	
}

public void saveGoal()
{
	System.out.println("save goal methods");
	
}

public Integer getWeight() {
	return weight;
}

public void setWeight(Integer weight) {
	this.weight = weight;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getShoeNo() {
	return shoeNo;
}

public void setShoeNo(Integer shoeNo) {
	this.shoeNo = shoeNo;
}

public Integer getJersieNo() {
	return jersieNo;
}

public void setJersieNo(Integer jersieNo) {
	this.jersieNo = jersieNo;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public Player()
{
	name = "";
	weight = 0;
	shoeNo = 0;
	jersieNo = 0;
	team = "";
}

public Player(String name, Integer weight, Integer shoeNo, Integer jersieNo,String team)
{
	this.name = name;
	this.weight = weight;
	this.shoeNo = shoeNo;
	this.jersieNo = jersieNo;
	this.team = team;
}
}
