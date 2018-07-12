package me;

public  class Bubble {

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



public static void sort(int array[])
   {
			   int i,j,temp,n=array.length;
			    System.out.println("bubble sort");
			    for(i=0;i<n;i++)
			    {
			   	 System.out.println(array[i]);
			    }
			     
			      for(i=0;i<n-1;i++)
			      {
			    	for(j=0;j<n-i-1;j++)  
			    	{
			    		if(array[j] > array[j+1])
			    		{
			    			temp=array[j];
			    			array[j]=array[j+1];
			    			array[j+1]=temp;
			    		}
			    	}
			      }
			      System.out.println("sorted array");
			     for(i=0;i<n;i++)
			     {
			    	 System.out.println(array[i]);
			     }
				}
			

} 
