package Sample;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator implements ActionListener {
	
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,r,div,mul,add,sub,mod,c;
	Calculator()
	{
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		t1=new JTextField(15);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		div=new JButton("/");
		mul=new JButton("*");
		add=new JButton("+");
		sub=new JButton("-");
		mod=new JButton("%");
		r=new JButton("=");
		c=new JButton("C");
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(add);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(sub);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(r);
		p.add(mul);
		p.add(b0);
		p.add(mod);
		p.add(div);
		p.add(c);
		
		
		
		f.setSize(200,300);
		f.setContentPane(p);
		f.setVisible(true);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		add.addActionListener(this);
		mul.addActionListener(this);
		mod.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		c.addActionListener(this);
		r.addActionListener(this);
	
		
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		int n1,m,d,rem,ad,sub,r;
	
		if(e.getSource()==b1)
	
			t1.setText(t1.getText()+"1");

		if(e.getSource()==b2)

			t1.setText(t1.getText()+"2");

		if(e.getSource()==b3)
				t1.setText(t1.getText()+"3");

		if(e.getSource()==b4)
t1.setText(t1.getText()+"4");

		if(e.getSource()==b5)
	t1.setText(t1.getText()+"5");
		if(e.getSource()==b6)
	t1.setText(t1.getText()+"6");

		if(e.getSource()==b7)

			t1.setText(t1.getText()+"7");

		if(e.getSource()==b8)
			t1.setText(t1.getText()+"8");

		if(e.getSource()==b9)
			t1.setText(t1.getText()+"9");

		if(e.getSource()==b0)
			t1.setText(t1.getText()+"0");
		
		n1=Integer.parseInt(t1.getText());
		if(e.getSource()==add)
		{
			t1.setText(t1.getText()+"+");
			
			r=n1;//+n2;
			t1.setText(String.valueOf(r));
		}
		
		
		//n2=Integer.parseInt(t1.getText());
		//t1.setText(String.valueOf(n2));
		//if(e.getSource()==add)
		//	r=n1+n2;
		
		//t1.setText(String.valueOf(r));	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();

	}

	


	

}
