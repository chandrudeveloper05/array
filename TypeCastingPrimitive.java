package loop;

public class  TypeCastingPrimitive {
public static void main(String[] args)
{
     int myInt=9;
double myDouble=myInt;
System.out.println(myInt);
System.out.println(myDouble);//widening casting

System.out.println("-----------------------------------------");

     
double myDouble2=34.4d;
int myInt2=(int) myDouble2;
System.out.println(myDouble2);//arrow casting
System.out.println(myInt2);
}
}
 
