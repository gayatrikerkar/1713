package application;

import pojo.Player;
import pojo.Ball;
public class FootballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Player goalkeeper = new Player();
      Player striker = new Player("yuga", 60, 7, 11, "argentina");
      System.out.println("striker : " + " " + striker.getName() + " " + striker.getWeight() + " " + striker.getShoeNo() + " " + striker.getJersieNo() + " " + striker.getTeam());
	 goalkeeper.setName("tomm");
	 System.out.println("goalkeeper : " + goalkeeper.getName());
	 Ball one = new Ball();
	 Ball two = new Ball(20, 5, "pink", "nike");
	 System.out.println("two : " + " " + two.getSizee() + " " + two.getWeight() + " " + two.getColor() + " " + two.getBrand());
	 one.setColor("black");
	 System.out.println("one : " + one.getColor());
	}

}
