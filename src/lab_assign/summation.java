package lab_assign;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
public class summation implements ActionListener{
	JFrame f= new JFrame("Addition");
Label l1= new Label("no. 1");
Label l2= new Label("no. 2");
Label l3= new Label("Result");
TextField t1= new TextField();
TextField t2= new TextField();
TextField t3= new TextField();
Button b = new Button("ADD");
Button b1 = new Button("CANCEL");
summation()
{
l1.setBounds(50,50,100,20);	
l2.setBounds(50,75,100,20);	
l3.setBounds(50,150,100,20);	
t1.setBounds(250,50,100,20);	
t2.setBounds(250,75,100,20);	
t3.setBounds(250,150,100,20);	
b.setBounds(50,110,75,20);
b1.setBounds(50,200,60,40);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b);
f.add(b1);
b.addActionListener(this);
b1.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(600,600);
}
public void actionPerformed(ActionEvent e)
{
 int n1=Integer.parseInt(t1.getText());
 int n2=Integer.parseInt(t2.getText());
if(e.getSource()==b)
{
	t3.setText(String.valueOf(n1+n2));
}
if(e.getSource()==b1)
{
	System.exit(0);
}
}
public static void main(String...s)
{
	new summation();
}
}


