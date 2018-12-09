package lab_assign;
import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
        }  
    }); 
    JButton c=new JButton("click here too");
    c.setBounds(100,150,130,30);
    c.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e)
    	{tf.setText("Thank you");
    }});
    f.add(b);f.add(tf);  f.add(c); 
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  }