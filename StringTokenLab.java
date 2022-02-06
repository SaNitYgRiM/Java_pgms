package SamplePgms;
import java.util.*;  
public class StringTokenLab
{  
 public static void main(String args[]) 
 {  
	 
	 String s;int sum=0,num;
	 System.out.println("enter integers:");
	 Scanner sc=new Scanner(System.in);
	 s=sc.nextLine();
   StringTokenizer st = new StringTokenizer(s," ");
     while (st.hasMoreTokens()) 
     {  
    	 num=Integer.parseInt(st.nextToken());
    	 sum+=num;
         System.out.print(num+" ");
         
         
     }  
     System.out.println("\nsum:"+sum);
   }  
} 
