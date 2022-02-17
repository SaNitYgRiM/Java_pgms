package SamplePgms;
import javax.swing.*;


import java.awt.event.*;
import java.util.Arrays;
import java.awt.*;
public class Calculator implements ActionListener {
	
	JTextField t1;	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,r,div,mul,add,sub,mod,c;
	Calculator()
	{
		JFrame f=new JFrame("Calculator");
		JPanel p=new JPanel();
		p.setBackground(Color.CYAN);
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
		p.add(div);
		p.add(mul);
		p.add(b0);
		p.add(mod);
		p.add(c);
		p.add(r);
		
		
		
		f.setContentPane(p);
		
		
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
	
		f.setSize(200,225);
		f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	int str1=0,str2,res=0,n=0,t = 0;String st1=null,s,st2 = null;	char ch;
	//while(e.getSource()!=r)
	{
		if(e.getSource()==b1)
	
			t1.setText(t1.getText()+"1");

		else if(e.getSource()==b2)

			t1.setText(t1.getText()+"2");

		else if(e.getSource()==b3)
				t1.setText(t1.getText()+"3");

		else if(e.getSource()==b4)
       t1.setText(t1.getText()+"4");

		else if(e.getSource()==b5)
	    t1.setText(t1.getText()+"5");
		else if(e.getSource()==b6)
	    t1.setText(t1.getText()+"6");

		else if(e.getSource()==b7)

			t1.setText(t1.getText()+"7");

		else if(e.getSource()==b8)
			t1.setText(t1.getText()+"8");

		else if(e.getSource()==b9)
			t1.setText(t1.getText()+"9");

		else if(e.getSource()==b0)
			t1.setText(t1.getText()+"0");
		
		
		else if(e.getSource()==add)
		{
		
			String s2=t1.getText();
			
			str1=Integer.parseInt(s2);
			
			t1.setText(t1.getText()+"+");
			//t1.setText(String.valueOf(str1));
		/*	 while(t1.getText()!="\0")
			 {
				n++;
			 if(t1.getText()=="+"){
				t=n;
				ch=t1.getText().charAt(n+1);
				
			 }
			 
			 } st2=t1.getText().substring(t+1,n);
			 
	
			 str2=Integer.parseInt(st2);
			res=str1+str2;
			*/}
			
		
		else if(e.getSource()==sub)
		{
			t1.setText(t1.getText()+"-");
			res-=Integer.parseInt(t1.getText());
			
		}
		else if(e.getSource()==mul)
		{
			t1.setText(t1.getText()+"*");
			res*=Integer.parseInt(t1.getText());
			
		}
		else if(e.getSource()==mod)
		{
			t1.setText(t1.getText()+"%");
			res%=Integer.parseInt(t1.getText());
			
		}
		else if(e.getSource()==div)
		{
			t1.setText(t1.getText()+"/");
			res/=Integer.parseInt(t1.getText());
			
		}
		else if(e.getSource()==c)
		{
			t1.setText(" ");
		}
		
		else if(e.getSource()==r)	
			{
			
			String s2=t1.getText();
			int l=s2.length();
			
			char[] ft=s2.toCharArray();
			//int l=((CharSequence) t1).length();
			 for(int i=0;i<l;i++)
			 {
				n++;
			 if(ft[i]=='+'||ft[i]=='-'||ft[i]=='*'||ft[i]=='/'||ft[i]=='%') {
		
				t=n;
				//.setText(String.valueOf(t));  t=2                 //just for checking
			 }
			 
			 }//
			 char[] ft1=new char[l-t];                                                //working till here
			 for(int i=t,j=0;i<l;i++,j++)
			 {                      
				 
				 ft1[j]= ft[i];
				 
			 }
			 String s3=String.valueOf(ft1);
			// t1.setText(s3);
			 str2=Integer.parseInt(s3);
			 
			// st2=t1.getText().substring(t+1,l);
			 res=str1+str2;
			 t1.setText(String.valueOf(str1));
			 //str2=Integer.parseInt(st2);
			
			 t1.setText(t1.getText()+"\n="+String.valueOf(res));;
			}
		else ;}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();

	}

}
