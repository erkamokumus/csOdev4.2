package arrays;

public class cs2 {
	public static void main(String[] args) 
	{
		//Write a function that reverses a list, preferably in place
		//2. ödev
		
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		reverse(array,0,9);
		for(int i=0;i<array.length;i++) 
		{
			System.out.println(array[i]);
		}
}
	
	
	static void reverse(int arr[], int start, int end) 
	{ 
int u; 
   
while (start < end) 
{ 
    u = arr[start];  
    arr[start] = arr[end]; 
    arr[end] = u; 
    start++; 
    end--; 
}  
}      
	
}


