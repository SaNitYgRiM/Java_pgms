package Sample;
import java.util.*;
abstract class Shape
{
	abstract void NoOfSides();
}
class Rectangle extends Shape
{
	void NoOfSides()
	{
		System.out.println("I am Rectangle,I have 4 sides!");
	}
}
class Triangle extends Shape
{
	void NoOfSides()
	{
		System.out.println("I am Triangle,I have 3 sides!");
	}
}
class Hexagon extends Shape
{
	void NoOfSides()
	{
		System.out.println("I am Hexagon,I have 6 sides!");
	}
}
public class abstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.NoOfSides();
		Triangle t=new Triangle();
		t.NoOfSides();
		Hexagon h=new Hexagon();
		h.NoOfSides();

	}

}
