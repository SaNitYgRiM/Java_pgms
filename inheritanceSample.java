package Sample;
import java.util.*;
class Employee{
	String name,Address;
	int Age,PhoneNo,Salary;
	void PrintSalary()
	{
		System.out.println("Salary: "+Salary);
		
	}
}
class Officer extends Employee{
	String specialisation;
	void input()
	{Scanner obj=new Scanner(System.in);
		System.out.println("Enter name of the Officer:");
		name=obj.next();
		System.out.println("Enter Age of the Officer:");
		Age=obj.nextInt();
		System.out.println("Enter Phone no. of the Officer:");
		PhoneNo=obj.nextInt();
		System.out.println("Enter Address of the Officer:");
		Address=obj.next();
		System.out.println("Enter Salary of the Officer:");
		Salary=obj.nextInt();
		System.out.println("Enter Specialisation of the Officer:");
		specialisation=obj.next();
	}
}
class Manager extends Employee{
	String Department;
	void Input()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter name of the Manager:");
		name=obj.next();
		System.out.println("Enter Age of the Manager:");
		Age=obj.nextInt();
		System.out.println("Enter Phone no. of the Manager:");
		PhoneNo=obj.nextInt();
		System.out.println("Enter Address of the Manager:");
		Address=obj.next();
		System.out.println("Enter Salary of the Manager:");
		Salary=obj.nextInt();
		System.out.println("Enter Department of the Manager:");
		Department=obj.next();
	}
}
public class inheritanceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
Officer of=new Officer();
Manager M=new Manager();
of.input();
System.out.println("______________________");
M.Input();
System.out.println("__________OFFICER:_________\nNAME:"+of.name+"\nAge:"+of.Age+"\nPhone no:"+of.PhoneNo+"\nAddress:"+of.Address+"");
of.PrintSalary();
System.out.println("Specialisation:"+of.specialisation);
System.out.println("\n__________MANAGER:_________\nNAME:"+M.name+"\nAge:"+M.Age+"\nPhone no:"+M.PhoneNo+"\nAddress:"+M.Address+"");
M.PrintSalary();
System.out.println("Department:"+M.Department);

	}

}
