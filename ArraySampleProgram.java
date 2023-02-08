package arrayCodes;
import java.util.Scanner;
public class ArraySampleProgram {
	public static void main(String[] args) {		
		ArraySampleProgram array=new ArraySampleProgram();
			  // array.linearSearch();	
		      // array.TwoDimensional();
			  // array.binarySearch();
			  // array.BubbolSort();    
			  // array.AddtionOfTwoNumbers();
		         array.AdditonOfTwoDimensionlaArray();
			     array.MultiplicationofSigleArray();
	}
	private void AdditonOfTwoDimensionlaArray() {
		// TODO Auto-generated method stub
		 int[][]m1= {{10,20,-30},{100,80,70}}; 
         int[][]m2= {{400,20,30},{10,20,30}};
         for(int row=0;row<m1.length;row++)  
         {
         for(int col=0; col<m1[0].length;col++)     
         {
       		  System.out.print(m1[row][col]+m2[row][col]+" ");           	  
         }
         System.out.println();  
         }
         System.out.println("-------------------------------------------------");
         // using third variable
       
            
	}
	private void MultiplicationofSigleArray() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40}; 
		int b[]= {1,2,3};
		int small=a.length<b.length?a.length:b.length;
		int large=a.length>b.length?a.length:b.length;
		int c[]= new int[large]; 
		for(int i=0;i<small;i++)
		{
			c[i]=a[i]*b[i];
		}
		if(a.length>b.length)
		{
			for(int i=small;i<c.length;i++)
			{
				c[i]=a[i];
			}
		}
		if(a.length<b.length)
		{
			for(int i=small;i<c.length;i++)
			{
				c[i]=b[i];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
	private void AddtionOfTwoNumbers() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit of a");
		int digit_a=sc.nextInt();
		System.out.println("Enter the digit of b");
		int digit_b=sc.nextInt();
		int a[]=new int[digit_a];
		int b[]=new int[digit_b];
		int len=a.length+b.length;
		int c[]=new int[len];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the values of a");
			a[i]=sc.nextInt();
			c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++)
		{
			System.out.print("Enter the values of b");
			b[j]=sc.nextInt(); 
			c[i]=b[j];
			j++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
	private void BubbolSort() {
               int[]arr= {15,20,30,3};
               for(int j=1;j<arr.length;j++)
               {
               for(int i=0;i<arr.length-j;i++)
               { 
            	   if(arr[i]>arr[i+1])
            	   {
            	   int temp=arr[i];
            	   arr[i]=arr[i+1];
            	   arr[i+1]=temp;
               }
               }	   
               } 
               for(int i=0;i<arr.length;i++)
               {
            	   System.out.print(arr[i]+" ");
               }
               System.out.println();
               System.out.println("Greatest no is :"+arr[3]);
	           System.out.println("Smallest no is :"+arr[0]); 
	           
	}
	private void binarySearch() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of array size:");
		 int size=sc.nextInt(); 
		 System.out.println("Enter the number of index values");
		 int marks[]=new int[size];
		 
		 for(int i=0;i<marks.length;i++)
		 {
			 marks[i]=sc.nextInt();
		 }
		         System.out.print("Enter the no:");
		            int no=sc.nextInt();
//                  int no=4;
//                  int []marks= {10,20,30,49};
                  int s=0,e=marks.length-1;
                  while(true) {
                	  int m=(s+e)/2;
                	  if(no==marks[m])
                	  {
                		  System.out.println("Position of given no is:"+m);
                		  break;
                	  }
                	  else if(no>marks[m])
                	  {
                		  s=m+1;
                	  }
                	  else if(no<marks[m])
                	  {
                		  e=m-1;
                	  }
                	  if(s>e)
                	  {
                		  System.out.println("given no is not present");    
                		  break;
                	  }
                  }
	}

	private void linearSearch() {
                       
                       Scanner sc=new Scanner(System.in);
                       System.out.print("Enter the number:");
                       int no=sc.nextInt();
                        int []marks= {10,20,30,90,76};
                        int count=0;
                        for(int i=0;i<marks.length;i++) 
                        {
                        	
                        	if(no==marks[i])
                        	{ 
                        		count++;
                        	} 
                        	if(count!=0)
                        	{
                        		System.out.println("Given no is present at:"+i);
                        	}
	                     }                   
                            if(count==0)
                            {
                            	System.out.println("Given no is not present");
                            }
                        	  
	}
	private void TwoDimensional() { 
                   int[][]m= {{10,20,30},{100,80,70},{20,30,40}};
                  // int[][]m1= {{10,20,30},{10,20,30}};
                  // System.out.println(m[0].length);
                 //  System.out.println(m[0][0]+m1[0][0]); 
                   int count=0,no=2;
                   for(int j=0; j<m.length; j++) 
                   {
                	 for(int i=0; i<m[j].length; i++)
                	 {
                		// System.out.print(i+" ");
                		if(m[j][i]>=90)
                		{
                			count++;
                			//System.out.println(m[j][i]);
                		} 
                		if(j==i||i==no-j) 
                		{
                			System.out.print(m[j][i]+" "); 
                		}
                		else
                		{
                			System.out.print("  ");
                		}
//                		 System.out.print(m[j][i]+" ");
          	 }
                	  System.out.println();
                
                   }
//                   System.out.print(count);
//                    System.out.println(m.length);
                   
	}              

	
    

	
}