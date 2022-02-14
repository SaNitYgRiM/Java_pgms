package Sample;
import java.util.Scanner;
public class DLL {

	    //A node class for doubly linked list

	    class Node{  

	        int item;  

	        Node previous;  

	        Node next;  

	         public Node(int item) {  

	            this.item = item;  

	        }  

	    }  

	    //Initially, head and tail is set to null

	    Node head, tail = null;  

	   

	    //add a node to the list  

	    public void addNode(int item) {  

	        //Create a new node  

	        Node newNode = new Node(item);  

	        //if list is empty, head and tail points to newNode  

	        if(head == null) {  

	            head = tail = newNode;  

	            //head's previous will be null  

	            head.previous = null;  

	            //tail's next will be null  

	            tail.next = null;  

	        }  

	        else {  

	            //add newNode to the end of list. tail->next set to newNode  

	            tail.next = newNode;  

	            //newNode->previous set to tail  

	            newNode.previous = tail;  

	            //newNode becomes new tail  

	            tail = newNode;  

	            //tail's next point to null  

	            tail.next = null;  

	        }  

	    }  

	    public void deleteNodes() {

	    	int x = head.item;

	        head = head.next;

	        System.out.println("Element "+x +" got deleted");

	   }

	//print all the nodes of doubly linked list  

	    public void printNodes() {  

	        //Node current will point to head  

	        Node current = head;  

	        if(head == null) {  

	            System.out.println("Doubly linked list is empty");  

	            return;  

	        }  

	        System.out.println("Nodes of doubly linked list: ");  

	        while(current != null) {  

	            //Print each node and then go to next.  

	            System.out.print(current.item + " ");  

	            current = current.next;  

	        }  

	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num;String ch="n";
		DLL l=new DLL();
		Scanner obj=new Scanner(System.in);
		do
		{
			System.out.println("DOUBLY LINKED LIST:\n1.INSERT AT END\n2.DELETE FROM BEGINNING\n3.DISPLAY\n4.EXIT\nenter your option(1/2/3/4):");
			n=obj.nextInt();
		
			switch(n)
			{
			case 1:System.out.println("enter the no. to be inserted:");
			        num=obj.nextInt();
                    l.addNode(num);l.printNodes();break;
			case 2:l.deleteNodes();break;
			case 3:l.printNodes();break;
			case 4:System.exit(0);
			}
			System.out.println("\nDo you wish to continue(y/n):");
			ch=obj.next();
			
		}while(ch.equalsIgnoreCase("y"));

	}

}
