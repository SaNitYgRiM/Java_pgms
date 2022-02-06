package SamplePgms;
import java.util.*;


class Tab
{   
	synchronized void display(int n)
      { 
       for(int i=1;i<=10;i++)
        {  
         System.out.println(n+"*"+i+"="+n*i);  
         try
	{  
         Thread.sleep(400);  
         }
         catch(Exception e)
         {System.out.println(e);
	}  
        }
       }  
      } 
class tabl extends Thread
{  Tab t;  int num;
   tabl(Tab t,int num)
   {  this.t=t;
   this.num=num;
      
   }  
   public void run()
   {  
   t.display(num);
   }       
} 
public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tab obj = new Tab();int t;
		 Scanner ob=new Scanner(System.in);
		System.out.println("enter the table to be run by thread1:");
		t=ob.nextInt();
		 tabl t1=new  tabl(obj,t);
		 System.out.println("enter the table to be run by thread2");
		 t=ob.nextInt();
		 tabl t2=new  tabl(obj,t);
		 System.out.println("enter the table to be run by thread3");
		 t=ob.nextInt();
		 tabl t3=new  tabl(obj,t);
		   t1.start();  
		   t2.start();  
		   t3.start();

	}

}

 
		  
		  
		   
		  