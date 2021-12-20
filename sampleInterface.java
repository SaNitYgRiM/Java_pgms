package Sample;
import java .util.*;
abstract class Animal
{
	int legs;
	String name;
	Animal(int legs)
	{
		this.legs=legs;
	}
	abstract void walk();
	
	abstract void eat();

		
	
}
interface Pet
{
   String getName();
   void setName(String name);
   void play();
  
}
class Cat extends Animal implements Pet
{

	Cat(int legs) {
		super(legs);
		
	}

	
	public String getName() {
		
		return this.name ;
	}

	
	public void setName(String name) {
		this.name=name;
		
	}

	
	public void play() {
		System.out.println("Cat likes to play with the ball");
	}

	
	void walk() {
		System.out.println("This animal walks by "+legs+"legs");
	}
	void eat() {
		System.out.println("Cat eat Fishes");
	}
	
}
class Spider extends Animal implements Pet
{

	Spider(int legs) {
		super(legs);
	}

	
	public String getName() {
		
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
		
	}

	
	public void play() {
		System.out.println("Likes to weave webs!");
		
	}

	
	void walk() {
		System.out.println("This animal walks by "+legs+"legs");
	}


	void eat() {
		System.out.println("Spider eat insects");
		
	}
	
}
class Fish extends Animal implements Pet
{

	Fish(int legs) {
		super(legs);
		
	}

	
	public String getName() {
		
		return this.name;
	}

	
	public void setName(String name) {
		this.name=name;
		
	}

	
	public void play() {
		System.out.println("Fish likes to swim!");
	}

	
	void walk() {
		System.out.println("Fish has no  legs");
		
	}

	
	void eat() {
		System.out.println("Fish eat plants");
		
	}
	
}



public class sampleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Fish f=new Fish(0);
	    f.setName("NEMO");
	    System.out.println("______________________________");
	    System.out.println("This fish's name is "+f.getName());
	    f.eat();
	    f.walk();
	    f.play();
	    System.out.println("______________________________");
	    Cat c=new Cat(4);
	    c.setName("Oreo");
	    System.out.println("This cat's name is "+c.getName());
	    c.walk();
	    c.eat();
	    c.play();
	    c.setName("kitty");
	    System.out.println("New name of cat  is "+c.getName());
	    System.out.println("______________________________");
		Spider s=new Spider(8);
	    s.eat();
	    s.walk();
	   
		

	}

}

