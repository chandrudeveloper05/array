																																																																																																																																																																																																																																				package arrayCodes;

public class Swapping {
	public static void main(String[] args) {
              int[]a= {50,40,30,20};
              System.out.println("Before swapping");
               for(int i=0;i<a.length;i++)
               {
            	   System.out.print(a[i]+" "); 
               }
               System.out.println("-----------------------------------------------");
               for(int j=1;j<a.length;j++)
               {
              for(int i=0;i<a.length-j;i++)
              {
            	  if(a[i]>a[i+1]) 
            	  {
            		int  temp=a[i];
            		 a[i]=a[i+1];
            		// System.out.println(a[i]);
            		 a[i+1]=temp; 
            		 
            	  } 
              }
              
               }
              System.out.println();
              System.out.println("After swapping");
              for(int i=0;i<a.length;i++)
              {
            	  System.out.print(a[i]+" "); 
	          }
              System.out.println();
              int max=a.length-1;
                 System.out.println("max :  "+a[max]);
                 int a1=3;
                  int i1;
                  i1=a1<<5; 
                 // System.out.println(a1);
                  System.out.println(i1);
              
	}
	      
}
 