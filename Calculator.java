package SamplePgms;
import javax.swing.*;
import java.awt.event.*;
//import java.util.Arrays;
import java.awt.*;
public class Calculator implements ActionListener {
	
		JFrame f;
		JTextField t;	
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,r,div,mul,add,sub,mod,c;
		 
		static double gt1=0,gt2=0,res=0;
		static int opt=0;
		 
		Calculator()
		{
		f=new JFrame("Calculator");
		JPanel p=new JPanel();
		p.setBackground(Color.CYAN);
		t=new JTextField(17);
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

		p.add(t);
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
		p.add(div);
		p.add(mul);
		p.add(b0);
		p.add(mod);
		p.add(c);
		p.add(r);

		f.setContentPane(p);
		f.setSize(200,225);
		f.setVisible(true);
		f.setResizable(false);

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
		 
		public void actionPerformed(ActionEvent e)

		{
		try {
			if(e.getSource()==b1)
				t.setText(t.getText().concat("1"));
				if(e.getSource()==b2)
				t.setText(t.getText().concat("2"));
				if(e.getSource()==b3)
				t.setText(t.getText().concat("3"));
				if(e.getSource()==b4)
				t.setText(t.getText().concat("4"));
				if(e.getSource()==b5)
				t.setText(t.getText().concat("5"));
				if(e.getSource()==b6)
				t.setText(t.getText().concat("6"));
				if(e.getSource()==b7)
				t.setText(t.getText().concat("7"));
				if(e.getSource()==b8)
				t.setText(t.getText().concat("8"));
				if(e.getSource()==b9)
				t.setText(t.getText().concat("9"));
				if(e.getSource()==b0)
				t.setText(t.getText().concat("0"));

				if(e.getSource()==add)
				{
				gt1=Double.parseDouble(t.getText());
				opt=1;
				t.setText("");
				}
				if(e.getSource()==sub)
				{
				gt1=Double.parseDouble(t.getText());
				opt=2;
				t.setText("");
				}
				if(e.getSource()==mul)
				{
				gt1=Double.parseDouble(t.getText());
				opt=3;
				t.setText("");
				}
				if(e.getSource()==div)
				{
				gt1=Double.parseDouble(t.getText());
				opt=4;
				t.setText("");
				}
				if(e.getSource()==mod)
				{
				gt1=Double.parseDouble(t.getText());
				opt=5;
				t.setText("");
				}
				if(e.getSource()==r)
				{
				gt2=Double.parseDouble(t.getText());
				switch(opt)
				{
				case 1: res=gt1+gt2;
				break;
				case 2: res=gt1-gt2;
				break;
				case 3: res=gt1*gt2;
				break;
				case 4: res=gt1/gt2;
				break;
				case 5:res=gt1%gt2;
				default: res=0;
				}
				t.setText(""+res);
				}
				if(e.getSource()==c)
				t.setText("");

			
		}catch(ArithmeticException e1)
		{
		    System.out.println(e1);
		}
	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();

	}

}
