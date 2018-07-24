package Me;

public abstract class Staff {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Staff()
{
	name ="";
}

public Staff(String name) {
	//super();
	this.name = name;
}

public abstract void calsal();
}
