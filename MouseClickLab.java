package SamplePgms;

import java.awt.*;
import java.awt.event.*;


public class MouseClickLab extends Frame implements MouseListener,MouseMotionListener{

public MouseClickLab()
{
	
	   setSize(400,400);
	   setVisible(true);

  	addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent we) {
         System.exit(0);
       }
    	});
	
	addMouseListener(this);
	addMouseMotionListener(this);
}

public void mousePressed(MouseEvent e){
	setBackground(Color.black);
	System.out.println("Mouse Pressed");
	setTitle("Mouse Pressed");
}
public void mouseReleased(MouseEvent e){

	setBackground(Color.blue);
	System.out.println("Mouse Released");
	setTitle("Mouse Released");
}
public void mouseClicked(MouseEvent e){

	setBackground(Color.yellow);
	System.out.println("Mouse Clicked");
	setTitle("Mouse Clicked");
}
public void mouseEntered(MouseEvent e){
	setBackground(Color.red);
	System.out.println("Mouse Entered");
	setTitle("Mouse Entered");
   
}
public void mouseExited(MouseEvent e){
	setBackground(Color.green);
	System.out.println("Mouse Exited");
	setTitle("Mouse Exited");
}
public void mouseMoved(MouseEvent me)
{
	Graphics g=getGraphics();
	setBackground(Color.magenta);
	String txt="hi my mouse is Moved";
	g.drawString(txt,me.getX(),me.getY());
	System.out.println("Mouse Moved");
	setTitle("Mouse Moved");

}
public void mouseDragged(MouseEvent me)
{
	Graphics g=getGraphics();
	setBackground(Color.orange);
	System.out.println("Mouse Dragged");
	setTitle("Mouse Dragged");
	  g.fillOval(me.getX(),me.getY(),10,10);  
}

public static void main(String args[]){
    new MouseClickLab();
}

}	