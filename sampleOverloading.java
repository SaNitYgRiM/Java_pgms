package Sample;
import java.util.*;
class Area
{
	void area(int r)
	{
		System.out.println("Area of the Circle with radius "+r+" is"+(3.14f*r*r));
		
	}
	void area(float b,float h)
	{
		System.out.println("Area of the Triangle with base "+b+" and height "+h+"is:"+(0.5*b*h));
		
    }
	void area(int l,int b)
	{
		System.out.println("Area of the Rectangle with length "+l+" and breadth "+b+"is:"+(l*b));
	}
	
}
public class sampleOverloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		Area a=new Area();
		float b,h;int l,br,r;
		System.out.println("Enter the base and height of the triangle:");
		b=obj.nextFloat();
		h=obj.nextFloat();
		System.out.println("Enter the length and breadth of the rectangle:");
		l=obj.nextInt();
		br=obj.nextInt();
		System.out.println("Enter the radius of the circle:");
		r=obj.nextInt();
		a.area(b,h);
		a.area(l,br);
		a.area(r);
		
	}
		


}
