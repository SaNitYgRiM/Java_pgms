package SamplePgms;
import java.util.*;
interface Food
{
	public void setType(String type);
	public double calculatePrice();
}
 class Pizza implements Food
{
	private String size;
	private String type;
	public void setSize(String size)
	{
		this.size=size;
	}
    public void setType(String t)
	{
		type=t;
	}
    public double calculatePrice()
    {
    	double price;
    	if(size.equalsIgnoreCase("small"))
    	{
    		if(type.equalsIgnoreCase("veg"))
    			price=80;
    		else
    			price=125;
    	}
    	else if(size.equalsIgnoreCase("medium"))
    	{
    		if(type.equalsIgnoreCase("veg"))
    			price=175;
    		else
    			price=225;
    	}
    	else
    	{
    		if(type.equalsIgnoreCase("veg"))
    			price=250;
    		else
    			price=275;
    	}
    	return price;
    }

}
class Lasagne implements Food
{
	private String type;
	double price;
    public void setType(String T)
	{
		type=T;
	}
    public double calculatePrice()
    {
    	if(type.equalsIgnoreCase("veg"))
			price=200;
		else
			price=300;
    	return price;
    }

}
public class RestaurantMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ch,s,t;int c;
		Pizza p=new Pizza();
		Lasagne l=new Lasagne();
		Scanner obj=new Scanner(System.in);
		do
		{
	    System.out.println("\n\n\b\t\tWELCOME!\n*************************************************\n\t\tRoushdat Resto\n*************************************************\n\tMENU\n\t1.Pizza\n\t2.Lasagne\n\t3.Exit\nEnter your Order:");
		c=obj.nextInt();
		switch(c)
			{
			 case 1:System.out.println("\n*************************************************\n\tSIZE:\n\t<>Small\n\t<>Medium\n\t<>Large\nEnter size:");
			        s=obj.next();
			        p.setSize(s);
				    System.out.println("\n*************************************************\n\tTYPE:\n\t<>Veg\n\t<>Non-Veg\nEnter Type:");
				    t=obj.next();
				    p.setType(t);
				    System.out.println("\n*************************************************\n*************************************************\nORDER DETAILS:\nPIZZA:"+s+":"+t+"\nTotal Price:"+p.calculatePrice()+"\n*************************************************\n*************************************************");
			        break;
			case 2:System.out.println("\n*************************************************\n\tTYPE:\n\t<>Veg\n\t<>Non-Veg\nEnter Type:");  
			       t=obj.next();
			       l.setType(t);
			       System.out.println("\n*************************************************\n*************************************************\nORDER DETAILS:\nLASAGNE:"+t+"\nTotal Price:"+l.calculatePrice()+"\n*************************************************\n*************************************************");
			       break;
			case 3:System.out.println("THANK YOU! Visit Again...");    
			default:break;
			}
		System.out.println("do you wish to continue(y/n):");
		ch=obj.next();
		}while(ch.equalsIgnoreCase("y"));
	}

}
