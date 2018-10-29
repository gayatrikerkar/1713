package Pojo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serializaStudent();
		deserializaStudent();
		
	}
		private static void serializaStudent()
		{
			FileOutputStream fout = null;
			ObjectOutputStream oout = null;
		    try {
		    	fout = new FileOutputStream(new File("Student.txt"));
		    	oout = new ObjectOutputStream(fout);
		    	Student s = new Student(1,"gayu","mca");
		    	oout.writeObject(s);	
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
		    
		    finally {
		    	try {
		    		fout.close();
		    		oout.close();
		    	}
		    	catch (IOException e)
		    	{
		    		e.printStackTrace();
		    	}
		}
			
		}
		
		
		private static void deserializaStudent()
		{
			FileInputStream fin = null;
			ObjectInputStream oin = null;
		    try {
		    	fin = new FileInputStream(new File("Student.txt"));
		    	oin = new ObjectInputStream(fin);
		    	Student s = (Student) oin.readObject();
		    	System.out.println("--->"+ s.getRoll_no() + "name" + s.getName() + "class" + s.getClass_name());
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
		    
		    finally {
		    	try {
		    		fin.close();
		    		oin.close();
		    	}
		    	catch (IOException e)
		    	{
		    		e.printStackTrace();
		    	}
		}
			
		}
		
		

	}


