package loop;

public class Amstrog {
public static void main(String[] args)
{ 
	Amstrog ams=new Amstrog(); 
    int no=10;
    while(no<=10000)
    {
    int digit=ams.count(no);
    //System.out.println(digit); 
    ams.count3(no,digit); 
      no++;
    }
	}                                                                                    
private int count (int no) {
	int count=0;
	while(0<no)
	{
		no=no/10;
		count++;
	}
	     return count;
	
}
private void count3(int no,int digit) {
    int total=0,arm=0,rem=0,no2=no;
    while(0<no)
    { 
    	rem=no%10; 
    	//total=rem*rem*rem;
        total=(int)Math.pow(rem,digit);
    	arm=arm+total;
    	no=no/10;
    }
      if(no2==arm) 
      {
    	  System.out.println("This no is amstrong no :"+no2);
      }
      else
      {
    	  //System.out.println("This no is not amstrong no :"+no2);
      }
}

	
}
