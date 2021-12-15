package SamplePgms;

import java.util.*;

class emp1
{
	float da,har,sal,gs;
	
	void display()
	{
		System.out.println("Name of class is Employee");
	}
	
	void calcSalary()
	 {
		 
		 gs=sal+sal*(da/100)+sal*(har/100);
		 System.out.println("The Gross Salary of Employee is:"+gs);
		 
	
	 }
		
}
class Engineer extends emp1
{
	
	
	
	void display()
	{
		System.out.println("Name of class is Engineer");
	}
	
	 void calcSalary()
	 {
		 super.display();
		 super.calcSalary();
		 display();
		 
		 System.out.println("The Gross Salary of Engineer is:"+2*gs);
		
	 }
		
}
public class empl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj=new Scanner(System.in);
		 int da,har,sal;
		 System.out.println("Enter the basic salary of the employee:");
		 sal=obj.nextInt();
		 System.out.println("Enter the DA of the employee:");
		 da=obj.nextInt();
		 System.out.println("Enter the HRA of the employee:");
		 har=obj.nextInt();
		Engineer e=new Engineer();
		e.sal=sal;
		e.da=da;e.har=har;
		e.calcSalary();
		 

	}

}
	


