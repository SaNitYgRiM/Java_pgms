package SamplePgms;
import java.util.*;
class randm extends Thread
{
	public void run(){
     
      
      Random r = new Random();
      for(int i=0;i<10;i++)
      {
      int rnum = r.nextInt(100);
      if(rnum%2==0)
      {
       evenr e= new evenr(rnum);
	   e.start();
	   
      }
       else
       {
    	oddr o=new oddr(rnum);
	   o.start();
       }}
	}
   
}
class evenr extends Thread
{
	
	int n;
	 evenr(int rnum) {
		
	 n=rnum;
     }
		public void run()
	{
		System.out.println(n+":"+"Square:"+(n*n));
	}
}
class oddr extends Thread
{
	int n;
	oddr(int rnum) {
		
		 n=rnum;
	     }
	public void run()
	{
		System.out.println(n+":"+"cube:"+(n*n*n));
	}
}

public class MultiThreadLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randm r=new randm();
		r.start();

		
	}

}
