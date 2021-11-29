package SamplePgms;
import java.util.*;
public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,p,q;
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter the no.of rows & columns of matrix1:");
	    m=obj.nextInt();
	    n=obj.nextInt();
	    System.out.println("enter the no.of rows & columns of matrix2:");
	    p=obj.nextInt();
	    q=obj.nextInt();
	    int a[][]=new int[m][n];
	    int b[][]=new int[p][q];
	    if(n!=p)
	    	System.out.println("Matrices cannot be multiplied!");
	    else
	    {
	    	System.out.println("ENTER MATRIX 1:\t");
	        for(int i=0;i<m;i++)
	            for(int j=0;j<n;j++)
	               a[i][j]=obj.nextInt();
	        System.out.println("ENTER MATRIX B:\t");
	        for(int i=0;i<p;i++)
	         for(int j=0;j<q;j++)
	           b[i][j]=obj.nextInt();
	        int pdt[][]=new int[m][q];
	        for(int i=0;i<m;i++)
	            for(int j=0;j<q;j++)
	            for(int k=0;k<n;k++)
	            pdt[i][j]+=a[i][k]*b[k][j];
	        System.out.println("Product of the 2 matrices:\n");
	        for(int i=0;i<m;i++)
	        {
	          for(int j=0;j<n;j++)
	        	  System.out.print(a[i][j]+" ");
	          System.out.print("\n");
	        }  
	    }
	}

}
