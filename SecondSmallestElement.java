package SamplePgms;
import java.util.*;
public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("enter the no.of elements in the array:");
		n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++)
			a[i]=obj.nextInt();
		Arrays.sort(a);
		System.out.println("2nd Smallest element of the array:"+a[1]);
	}

}
