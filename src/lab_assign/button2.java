package lab_assign;
import java.awt.*;
import javax.swing.*;
public class button2{
	public static void main(String[] args)
	{ JButton b= new JButton("button 1");
	JButton b1= new JButton("button 2");
	b.setBounds(50,100,125,200);
	b1.setBounds(150,150,125,200);
		JFrame j= new JFrame("button Example");
		 final JTextField t= new JTextField();
		t.setBounds(90,90,100,70);
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{	t.setText("data in text2");
				}});
		/*b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{	t.setText("data in text1");
		}});*/
		
		j.add(b);  j.add(t);
		//j.add(b1);
		j.setSize(700,700);
		j.setVisible(true);
		j.setLayout(null);
	}

}
