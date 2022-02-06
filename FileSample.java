package SamplePgms;
import java.io.*;
import java.util.Scanner;


public class FileSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str;
		Scanner obj=new Scanner(System.in);
		File f=new File("samp.txt");
		f.createNewFile();
		FileWriter f3= new FileWriter("samp.txt");
		System.out.println("Enter data:");
		String s=obj.nextLine();
		f3.write(s);
		f3.close();
		File f2=new File("new-samp.txt");
		f2.createNewFile();
		FileReader fi = new FileReader("samp.txt");
	    FileWriter  fo=new FileWriter("new-samp.txt",true);
		int c;  
		while ((c = fi.read()) != -1)
		{  
		 fo.write(c);  
		}   
		fi.close();  
		fo.close(); 
		
		FileReader fn = new FileReader("new-samp.txt");
		BufferedReader b=new BufferedReader(fn);
		System.out.println("Contents from new-samp.txt:");
		while((str=b.readLine()) != null)
		{
		
			System.out.println(str);
		}
		
		fn.close();

          
		
	}

}

		



