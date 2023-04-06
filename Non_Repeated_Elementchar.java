package arrayprograms;

public class Non_Repeated_Elementchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[]name= {'v','i','v','e','k'};
		
		char first=name[0];
		boolean repeated = false;
		for(int j=0;j<name.length;j++)
		{
		
		for(int i=j+1;i<name.length;i++)   
		{ 
			if(first == name[i])
			{
				repeated=true;
				break;
			}
		}
		System.out.println(first); 
	}
	}
}