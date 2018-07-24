package Me;

public class Teachingstaff extends Staff {
private Integer noOfteachingstaff;

public Integer getNoOfteachingstaff() {
	return noOfteachingstaff;
}

public void setNoOfteachingstaff(Integer noOfteachingstaff) {
	this.noOfteachingstaff = noOfteachingstaff;
}

public Teachingstaff(Integer noOfteachingstaff) {
	super();
	this.noOfteachingstaff = noOfteachingstaff;
}

public Teachingstaff()
{
	noOfteachingstaff=0;
}

public void calsal()
{
	System.out.println("sal of teaching staf");
}

}
