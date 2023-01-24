package arrayCodes;

import java.util.Scanner;

public class ArraySampleProgram {

	public static void main(String[] args) {
		ArraySampleProgram array=new ArraySampleProgram();
				//array.add();
			 //  array.add1();
				//array.add2();
			   array.binarysearch();
			    
           int marks[]= {95,93,89,81,91};
           //System.out.println("===============>"+marks.length);
           for(int i=0;i<marks.length;i++) 
           {
        	   if(i%2==0) {
        		//   System.out.println("even ==> "+marks[i]);
        	   }
        	   else if(i%2!=0)
        	   {
        		  // System.out.println("odd ==> "+marks[i]);
        	   }
           }
          // System.out.println();
	}

	private void binarysearch() {
   		Scanner sc=new Scanner (System.in);
   		System.out.println("Enter the number :");
   		int no=sc.nextInt();
   		System.out.println("Enter the value :");

   		int arr[]= {10,20,30,40,50};

   		//int arr[]= new int [4];
   		int s=0,e=arr.length-1;
   	    while(true)
   	    {
   	    	//System.out.println("print");
   	    	int m=(s+e)/2;
   	    	if(no==arr[m])
   	    	{
   	    		System.out.println("presented :"+m);
   	    		break;
   	    	}
   	    	else if(no<arr[m])
   	    	{
   	    		e=m-1;
   	    	}
   	    	else if(no>arr[m])
   	    	{
   	    		s=m+1;
   	    	}
   	    	if(s>e)
   	    	{
   	    		System.out.println("given  no is not present");
   	    		break;
   	    	}
   	    	//System.out.println(0/2);
   	    }
	}

	private void add2() {
          Scanner sc=new Scanner(System.in);
          //int no=sc.nextInt();
         // int[] marks=new int[no];
          int[] marks=new int[5];

          for(int i=0;i<marks.length;i++)
          {
        	  System.out.println("Enter the numbers");
        	  marks[i]=sc.nextInt(); 
          } 
          for(int i=0;i<marks.length;i++)
          {
        	  System.out.println(marks[i]);
          }
	}

	private void add1() {
        Scanner sc=new Scanner(System.in);
             System.out.println("Enter the no");
        int mark=sc.nextInt();
             
     int[] marks= {56,934,39,390,39};
       int count=0;//linear search
       for(int i=0;i<marks.length;i++)
       {
    	   if(mark==marks[i]) 
    	   { 
    		   count++;
    		   System.out.println("given no is present at :"+i); 
    	   }
       }
       if(count==0) 
	   {
		   System.out.println("given no is not  present ");
	   }
      System.out.println("------------------------------");
	} 

	private void add() {					
           int marks[]={154,157,134,139,190};
           System.out.println("===============>"+marks.length);
           int total=0,count=0;  
           for(int i=0;i<=4;i++)
           {
        	   if(marks[i]<35) 
        	   {
        		   count++;
        	   }
        	    total=total+marks[i];
           }
           if(count==0)
           {
           System.out.println(total); 
           System.out.println(total/marks.length); 
           }
           else {
        	   System.out.println("fail");
	}
           System.out.println("------------------------------");
           }
    

}