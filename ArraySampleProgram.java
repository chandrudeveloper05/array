package arrayCodes;

import java.util.Scanner;

public class ArraySampleProgram {

	public static void main(String[] args) {
		
		ArraySampleProgram array=new ArraySampleProgram();
				
		       array.TwoDimensional();
		
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