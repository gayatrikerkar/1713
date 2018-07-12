package pojo;

public class Ground {
private Integer length;
private Integer breadth;
private Integer noOfPlayer;
public Integer getLength() {
	return length;
}
public void setLength(Integer length) {
	this.length = length;
}
public Integer getBreadth() {
	return breadth;
}
public void setBreadth(Integer breadth) {
	this.breadth = breadth;
}

public Ground()
{
	length = 0;
	breadth = 0;
	noOfPlayer = 0;
}

public Ground(Integer length, Integer breadth, Integer noOfPlayers) {
	this.length = length;
	this.breadth = breadth;
	this.noOfPlayer = noOfPlayers;
}
public Integer getNoOfPlayer() {
	return noOfPlayer;
}
public void setNoOfPlayer(Integer noOfPlayer) {
	this.noOfPlayer = noOfPlayer;
}



}
