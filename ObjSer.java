package SamplePgms;
import java.io.*;
class Per implements Serializable
{
	int age;
	String name;
	Per(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public void display()

       {
		System.out.println("name:"+name+"\nage:"+age);
		}
}
public class ObjSer {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
      Per p=new Per("oreo",13);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      System.out.println("enter name:");
      p.name=br.readLine();
      System.out.println("enter age:");
      p.age=br.read();
      //p.display();
      try {
    	  FileOutputStream f1=new FileOutputStream("person.dat");
    	  ObjectOutputStream obj=new ObjectOutputStream(f1);
    	  obj.writeObject(p);
    	  System.out.println("obj serialised");
    	  f1.close();
      }catch(IOException e)
      {
    	  System.out.println(e.getMessage());
      }
      try {
			FileInputStream fin=new FileInputStream("person.dat");
			ObjectInputStream obj=new ObjectInputStream(fin);
			Per q1=(Per)obj.readObject();
			q1.display();
			fin.close();
			}
		catch(IOException e)
					{
				System.out.println(e.getMessage());
					}
	}

}
