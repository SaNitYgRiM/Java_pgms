package Sample;
import java.util.Scanner;
class InvalidAmountException extends Exception
{ 
	String msg;
	public InvalidAmountException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
class InsufficientFundsException extends Exception
{ 
	String msg;
	public InsufficientFundsException(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
 class bank
{
	Scanner ob=new Scanner(System.in);
	int amt,d=0,w,acc_no,n;
	void details()
	{
		System.out.println("enter the account no.:");
		acc_no=ob.nextInt();
		System.out.println("enter balance:");
		amt=ob.nextInt();
		
	}

	
	void deposit() 
	{
		
	    System.out.println("How much amount would you like to deposit:");
	    try 
	    {
	    d=ob.nextInt();
		if(d<=0)
		{
			
			throw new InvalidAmountException("Customers are not allowed to deposit amount<=0");
		}
		amt+=d;
	    }catch(InvalidAmountException e)
	    {
	    	System.out.println("enter valid deposit"+e.getMessage());
	    	
	    }
	    display();
	}
	void withdraw()
	{
		System.out.println("How much amount would you like to withdraw:");
		try
		{
			w=ob.nextInt();
		if(w<=0)
			throw new InvalidAmountException("Customers are not allowed to withdraw amount<=0");
		     throw new InsufficientFundsException("Customers are not allowed to withdraw amount grater than their bank balance");
		
	}catch(InvalidAmountException e)
    {
    	System.out.println("enter valid withdrawal amt"+e.getMessage());
    	
    }catch(InsufficientFundsException r)
    {
    	System.out.println("enter valid withdrawal amt"+r.getMessage());
    	
    }amt-=w;display();
		}
	void search_acc()
	{
		int acc;
		System.out.println("Enter account no. to be searched:");
		acc=ob.nextInt();
		for(int i=0;i<n;i++)
		{
		if(acc==acc_no)
		display();
		}
	}
	void display()
	{
	
		System.out.println("ACCOUNT NO.:"+acc_no+"\nBANK BALANCE:"+amt);
	}
	
}
public class bankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int choice,n;
		String ch="y";
		System.out.println("No.of customers:");
		n=obj.nextInt();
		bank[] b=new bank[n];
		
		for(int i=0;i<n;i++)
		{
			b[i]=new bank();
			b[i].details();
		   
		}
		
		
		while(ch.equalsIgnoreCase("y"))
		{
			System.out.println("__________BANK MENU__________\n\t1.Display account details\n\t2.Search by account number\n\t3.Deposit the amount\n\t4.Withdraw the amount\n\t4.Exit\nEnter your choice(1/2/3/4/5):");
			choice=obj.nextInt();
			switch(choice)
			{
			case 1:b[n].display();break;
		//case 2:b.search();break;
			case 3:b[1].deposit();break;
			case 4:b[1].withdraw();break;
			case 5:break;
			}
			System.out.println("Do you wish to continue(y/n):");
			ch=obj.next();
			
		}

	}

	}
