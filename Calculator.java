import javax.swing.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
JFrame f=new JFrame();
JLabel l1=new JLabel("1st Number");
JLabel l2=new JLabel("2nd Number");
JLabel l3=new JLabel("Result");
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JTextField t3=new JTextField();
JButton b1=new JButton("+");
JButton b2=new JButton("-");
JButton b3=new JButton("*");
JButton b4=new JButton("/");
JButton b5=new JButton("exit");
Calculator()
{
	l1.setBounds(50,80,80,20);
	l2.setBounds(50,120,80,20);
	l3.setBounds(50,160,80,20);
	t1.setBounds(200,80,80,20);
	t2.setBounds(200,120,80,20);
	t3.setBounds(200,160,80,20);
	b1.setBounds(50,250,50,20);
	b2.setBounds(100,250,50,20);
	b3.setBounds(150,250,50,20);
	b4.setBounds(200,250,50,20);
	b5.setBounds(250,250,50,20);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
f.setLayout(null);

f.setVisible(true);
f.setSize(400,500);
}
public void actionPerformed(ActionEvent e)
{
	int s=Integer.parseInt(t1.getText());
	int s1=Integer.parseInt(t2.getText());
	if(e.getSource()==b1)
	t3.setText(String.valueOf(s+s1));
if(e.getSource()==b2)
	t3.setText(String.valueOf(s-s1));
if(e.getSource()==b3)
	t3.setText(String.valueOf(s*s1));

if(e.getSource()==b4)
	t3.setText(String.valueOf(s/s1));

if(e.getSource()==b5)
	System.exit(0);
}
public static void main(String args[])
{
	new Calculator();
}
}
