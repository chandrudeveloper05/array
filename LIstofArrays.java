package interviewarrayprograms;

import java.util.Scanner;
public class LIstofArrays {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LIstofArrays arrays = new LIstofArrays();
		
	    //arrays.removing_given_number();
		//arrays.placing_given_number_in_last_indexOf_given_array();
	    //arrays.printing_reverse_order();
	    //arrays.Finding_Index();
	    //arrays.linear_search();
	    //arrays.Bubbole_sort();
	    //arrays.Binary_search();
	    //arrays.Removing_given_number();
		//arrays.Biggest_number();
		//arrays.Smaller_number();
		//arrays.Second_Biggest_number();
		//arrays.Second_Smallest_number();
		//arrays.Non_Repeted_Element();
		//arrays.Repeated();
		//arrays.Copying_all_the_elements_of_the_given_array_in_reverse_order_in_another_array();
		//arrays.Moving_all_elements_towards_left();
		//arrays.Moving_all_elements_towards_right();
		//arrays.Finding_negative_index();
		//additionOfTwoDimensional();
		//arrays.additionOfTwoMatrix();
        arrays.traves();		  
		 
	}
	private void traves() {
		// TODO Auto-generated method stub
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
	    for(int j=0;j<a.length;j++)
	    {
		    for(int i=0;i<a[j].length;i++)
		    {
		    	System.out.print(a[i][j]+" ");
		    }
                  System.out.println();
	    }
	}
	public void additionOfTwoMatrix()
	{
		int a[][]= {{10,20,30},{20,30,40},{20,30,40}}; 
		
		int b[][]= {{10,30,40},{30,20,40},{49,39,29}};
		
	    for(int j=0;j<a.length;j++)
	    {
	    	int total=0;
	    	for(int col=0;col<a[j].length;col++)
	    	{
	    		 System.out.print(a[j][col]+b[j][col]+" ");
	    	} 
	    	System.out.println();
	    }
	    
	}
	private void additionOfTwoDimensional() {
		// TODO Auto-generated method stub
		
		int a[][]= {{10,29,39},{30,30,30},{40,40,40}};  
		
		
		for(int j=0;j<a.length;j++)
		{
			int total=0;
		for(int i=0;i<a[j].length;i++) 
		{
			total=total+a[i][j];
		}
           		System.out.println("row :"+total);
		}
		
	}
	
	private void addition() {
		// TODO Auto-generated method stub
		
		int arr1[]= {10,20,30,40,4,5,6,4};
		
		int arr2[]= {10,20,45,45,45,45};
		
		int large = arr1.length>arr2.length?arr1.length:arr2.length;
		
		int c[]= new int[large];
		
		int small = arr1.length<arr2.length?arr1.length:arr2.length;
 
	for(int i=0;i<small;i++) 
	{
		c[i]=arr1[i]-arr2[i]; 
	}
	
	
	    
	
	
		if(arr1.length>arr2.length)
		{
			for(int i=small;i<c.length;i++)
			{
				c[i]=arr1[i];
			}
			
		}  
		if(arr1.length<arr2.length)
		{ 
			for(int i=small;i<c.length;i++)
			{
				c[i]=arr2[i]; 
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}


	private void Finding_negative_index() {
		// TODO Auto-generated method stub
		int arr[]= {10,-8,39,40,-3,5,-9};
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
			    count++;	
			}
		}
		
		
		int arr2[]= new int[count];
		
		int j=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
                arr2[j]=arr[i];  
				
                 j++;
			                 
			}
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}

   
	private void Moving_all_elements_towards_right() {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		
		int temp=arr[arr.length-1];
		
		int i=arr.length-1;
		for(;i>0;i--)
		{
			arr[i]=arr[i-1];
		} 
		            
		arr[0]=temp;  
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}


	private void Moving_all_elements_towards_left() {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50};
		
		int temp=arr[0];
		int i;
		for( i=0;i<arr.length-1;i++)                           
		{ 
			arr[i]=arr[i+1]; 
		}
		arr[i]=temp;                            
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}




	private void Copying_all_the_elements_of_the_given_array_in_reverse_order_in_another_array() {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50};
		
		int []arr2 = new int [arr.length];
 		
		int i=0,j=arr2.length-1;
		
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=arr[j];
			j--;
		}
//		while(i<arr2.length)
//		{
//			arr2[i]=arr[j];
//			i++;
//			j--;
//		}
		
		for(i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}




	private void Repeated() {
		// TODO Auto-generated method stub
	   int a[]= {10,20,30,40,20,40,40};  
	   
	   int b[]= new int[a.length];
	   
	   int[] freq = new int[a.length]; 
  	   for(int i=0;i<a.length;i++)
	  { 
		  int no=a[i];  
		  int count=1; 
		  for(int j=i+1;j<a.length;j++)
 		  { 
			  if(no==a[j]) 
			  {   
 	 			  count++;
	 			  freq[j]=-1;    
			   }
			  
		   } 
		  if(freq[i]!=-1) 
		   {
			   freq[i]=count;
		   } 
	  } 
	          int countOfDup=0; 
	          int j=0;
	          for(int i=0;i<freq.length;i++) 
	          {
	        	 
	        	  if(freq[i]>1) 
	        	  {
	        		  b[j]=a[i];
	        		  
	        		 // countOfDup++;
	        		  j++;
	        	  } 
	        	  
	          }
	          for(int i=0;i<b.length;i++)
	          { 
	        	  if(b[i]>0)   
	        	  {
	        	 // System.out.println(b[i]);
	        	  }
	          }
	        	  
	         
	          // System.out.println("Duplicates :"+countOfDup);    
	}
	private void Non_Repeted_Element() {  
		//TODO Auto-generated method stub 
		int a[]= {10,20,30,40,10,20};
		for(int j=0;j<a.length;j++)
 		{
			int count=0;
	     for(int i=0;i<a.length;i++)
	     {
	    	 if(a[j]==a[i])
	    	 {
	    		 count++;
	    	 }
	     }
	     if(count==1)
	     {
	    	 System.out.println(a[j]);
	    	 break; 
	     } 
		}
	}



	private void Second_Smallest_number()  {
		// TODO Auto-generated method stub
		int a[] = {20,50,30,5};
		int first =a[0];
		int second =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<first)
			{
				second=first;
				first=a[i];
				
			}
			else if(a[i]<second) 
			{
				second=a[i];
			}
			
		}
		System.out.println(second);
	}



	private void Second_Biggest_number() {
		// TODO Auto-generated method stub
		
		int a[] = {20,50,30,5};
		int first =a[0];
		int second =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
				
			}
			else if(a[i]>second) 
			{
				second=a[i];
			}
			
		}
		System.out.println(second);
	}



	private void Smaller_number() {
		// TODO Auto-generated method stub
		  int a[]= {10,20,30,100,4,6};
          int big = a[0];
          
          for(int i=0;i<a.length;i++)
          {
          	if(a[i]<big)
          	{ 
          		big=a[i];
          	}
          }
          System.out.println(big);
	}



	private void Biggest_number() {
		// TODO Auto-generated method stub
	                int a[]= {10,20,30,100,4,6};
	                int big = a[0];
	                
	                for(int i=0;i<a.length;i++)
	                {
	                	if(a[i]>big)
	                	{
	                		big=a[i];
	                	}
	                }
	                System.out.println(big);
	}



	private void Removing_given_number() {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,7,40};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==7)
			{
				continue;
			}
			System.out.println(a[i]);
		}
				
	}

	private void Binary_search()
    {
 	 
		int a[] = {10,20,30,50};
	    int min=0,max=a.length-1,given=23;
        
	    while(true)  
	    {
		    int mid=(min+max)/2; 

	    	if(a[mid]==given)  
	    	{
	    		System.out.println(given);     
	    		break;  
 	    	}
	    	else if(given<a[mid]) 
 	    	{ 
	    		max=mid-1; 
	    	}
	    	else if(given>a[mid]) 
	    	{
 	    		min=mid+1;  
	    	}  
	    	if(min>max)
	    	{
	    		System.out.println("Given no is not present ");
	    		break;
	    	}
	    }
	} 

	
	private void Bubbole_sort() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
				
		int length 	=sc.nextInt();
		
		int a[] = new int[length];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the values");
			
			a[i] = sc.nextInt();
			
		}
		
		//int a[]= {50,40,30,20,10};
		for(int j=1;j<a.length;j++)
		{
		for(int i=0;i<a.length-j;i++)   
	  	{
			if(a[i]>a[i+1]) 
			{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
		} 
		
	     //     System.out.println();
		}
		for(int j=0;j<a.length;j++)
		{
			 System.out.print(a[j]+" ");  
		}
		System.out.println(a[a.length-5]);
	}
	private void linear_search() {
		// TODO Auto-generated method stub
	
	    int a[]= {10,20,30,70};
		int i;
		for( i=0;i<a.length;i++)
		{
			if(a[i]==10)
			{
				System.out.println(i+ " positon");
				break;
			}
		}
		if(a.length==i)
		{
			 System.out.println("not present"); 
		} 
	}
	private void Finding_Index() {
		//TODO Auto-generated method stub
		int a[]= {10,7,20,5};
		int i; 
		for(i=0;i<a.length;i++)
		{
		      if(a[i]==7)
		      {
		    	  System.out.println(i);
		      }
		}
	}
	private void printing_reverse_order() {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	private void placing_given_number_in_last_indexOf_given_array() {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50}; 
		int count=0;
		int given=50;
		for(int i=0;i<arr.length;i++)  
		{
				 System.out.println(arr[i]);  
				 count++;
			 if(arr.length==count)
			{
				
			 	 System.out.println(given);  
			} 	
		}	 
	} 
	private void removing_given_number() {
	    //TODO Auto-generated method stub
		   
		int [] arr= {10,20,30,40};  
		int [] arr1=new int[arr.length];                              
		
		int given=20;
		
		for(int i=0;i<arr.length;i++)
		{
			if(given==arr[i])
			{
				continue;
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
	} 	
}