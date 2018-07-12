package me;

public class Bubble {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
   int data[] = null;//{3,5,12,11,7,9,2};
   
   
   
   public int[] getData() {
	return data;
}



public void setData(int[] data) {
	this.data = data;
}


public Bubble()
{
	data = null;
}

public Bubble(int[] data) {
	this.data = data;
}



public void sort()
   {
   int i,j,temp,n=data.length;
    System.out.println("bubble sort");
    for(i=0;i<n;i++)
    {
   	 System.out.println(data[i]);
    }
     
      for(i=0;i<n-1;i++)
      {
    	for(j=0;j<n-i-1;j++)  
    	{
    		if(data[j] > data[j+1])
    		{
    			temp=data[j];
    			data[j]=data[j+1];
    			data[j+1]=temp;
    		}
    	}
      }
      System.out.println("sorted array");
     for(i=0;i<n;i++)
     {
    	 System.out.println(data[i]);
     }
	}


} 
