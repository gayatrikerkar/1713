package Me;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Staff st1=new Teachingstaff();
Staff st2=new Nonteachingstaff();
st1.setName("gayu");
st2.setName("jos");
System.out.println("names are:" + st1.getName() + " " + st2.getName());
st1.calsal();
st2.calsal();
	}

}
