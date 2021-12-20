package Sample;
import java.util.*;
public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int fnum,snum,r;String a;
		do{
    System.out.println("Program to perform division\nEnter Number-1:");
    try
    {
     fnum=obj.nextInt();
     System.out.println("Enter Number-2:");
     snum=obj.nextInt();
     System.out.println("result="+(fnum/snum));
     
    }catch(ArithmeticException e )
    {
    	System.out.println("/ by zero");
    }
     System.out.println("End of Operation\nDo you want to continue y or n:");
     a=obj.next();
		}
     while(a.equalsIgnoreCase("y"));
    
	

}
}