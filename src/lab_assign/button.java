package lab_assign;
import javax.swing.*;
public class button{
public static void main(String[] args) 
{
JFrame f= new JFrame("button Example");
JButton b= new JButton("A=");
JButton c= new JButton("b=");
JButton d= new JButton("sum=");
c.setBounds(200,400,100,100);
b.setBounds(500,600,100,100);
d.setBounds(300,100,100,100);
f.add(b);
f.add(c);
f.add(d);
f.setSize(900,900);
f.setLayout(null);
f.setVisible(true);
}
}



