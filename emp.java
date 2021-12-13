package Sample;
import java.util.*;

class empl
{
	float sal;
	void display()
	{
		System.out.println("Name of class is Employee");
	}
	
	int calcSalary(int s,int da,int h)
	 {
		 System.out.println("s:"+s+" da:"+da+" h:"+h);
		 sal=s+s*(da/100)+s*(h/100);
		 
		 System.out.println("sal:"+sal);
		 System.out.println("The Gross Salary of Employee is:"+sal);
		 return (int) sal;
	
	 }
		
}
class Engineer extends empl
{
	
	int s;
	
	void display()
	{
		System.out.println("Name of class is Engineer");
	}
	
	 int calcSalary(int sal,int d,int har)
	 {
		 super.display();
		 s=super.calcSalary(sal, d, har);
		 display();
		 
		 System.out.println("The Gross Salary of Engineer is:"+2*s);
		return 0;
	 }
		
}
public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj=new Scanner(System.in);
		 int d,har,s;
		 System.out.println("Enter the basic salary of the employee:");
		 s=obj.nextInt();
		 System.out.println("Enter the DA of the employee:");
		 d=obj.nextInt();
		 System.out.println("Enter the HRA of the employee:");
		 har=obj.nextInt();
		Engineer e=new Engineer();
		e.calcSalary(s,d,har);
		 

	}

}
