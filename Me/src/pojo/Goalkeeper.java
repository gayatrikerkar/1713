package pojo;

public class Goalkeeper extends Player {
	boolean hasglouse;
public Goalkeeper(String name, Integer weight, Integer shoeNo, Integer jersieNo,String team,boolean hasgloluse )
{
  super(name,weight,shoeNo,jersieNo,team);
  this.hasglouse=false;
}
public boolean isHasglouse() {
	return hasglouse;
}
public void setHasglouse(boolean hasglouse) {
	this.hasglouse = hasglouse;
}
public Goalkeeper(boolean hasglouse) {
	super();
	this.hasglouse = hasglouse;
}




}
