

package SamplePgms;

class Employee{
	String name,Address;
	int Age,PhoneNo,Salary;
	void PrintSalary()
	{
		System.out.println("Salary: "+Salary);
		
	}
	Employee(String n,String A,int a,int p,int s)
	{
		name=n;
		Address=A;
		Age=a;
		PhoneNo=p;
		Salary=s;
	}
}
class Officer extends Employee{
	String specialisation;
	
	    Officer(String n,String A,int a,int p,int s,String S)
	    {
	    	super(n,A,a,p,s);
		specialisation=S;
	    }
	    void display()
	    {
	    System.out.println("__________OFFICER:_________\nNAME:"+name+"\nAge:"+Age+"\nPhone no:"+PhoneNo+"\nAddress:"+Address+"");
	    System.out.println("Specialisation:"+specialisation);

		PrintSalary();
	    }
}
class Manager extends Employee
{
	
	String Department;


	Manager(String n,String A,int a,int p,int s,String d)
	{
		super(n,A,a,p,s);
		Department=d;
		
	}
	void display()
	{
	System.out.println("\n__________MANAGER:_________\nNAME:"+name+"\nAge:"+Age+"\nPhone no:"+PhoneNo+"\nAddress:"+Address+"");
	PrintSalary();
	System.out.println("Department:"+Department);
	}
		
	
}

public class Inheritancepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Officer of=new Officer("Mark","xywz",34,67787,34000,"hjgj");
		Manager M=new Manager("Luke","jhgjz",30,7687,40000,"HR");
		System.out.println("______________________");
		of.display();
		M.display();
		


	}

}

