package lab_assign;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class quiz {
	Frame f= new Frame();
	 Label l1=new Label("The following class can be used to create following images");
	 Label l2=new Label("By default the new JSpinner component Encapsulates");
	 Label l3=new Label("JDesktop Pane is an example of");
	 Label l4=new Label("A cell renderer is?");   
	 Button b1=new Button("Submit");
	 Button b2=new Button("Reset");
	 JPanel p = new JPanel();
	 final JRadioButton r1 = new JRadioButton("A. GreyFilter"); 
	final  JRadioButton r2 = new JRadioButton("B. SwingConstant"); 
	final  JRadioButton r3 = new JRadioButton("A. SwingUtilities"); 
	
   final JRadioButton r4 = new JRadioButton("A. AJTextArea,two JButtons and ComboBox"); 
   final JRadioButton r5 = new JRadioButton("A. Jlayered pane,three jbuttons"); 
  	final  JRadioButton r6 = new JRadioButton("B. jbuttons"); 
  	final  JRadioButton r7 = new JRadioButton("A.jbuttons textfield "); 
  	
     final JRadioButton r11 = new JRadioButton("A.container for jinternal"); 
     final JRadioButton r9 = new JRadioButton("A.mdi"); 
 	final  JRadioButton r10 = new JRadioButton("B.subclass of jlayered"); 
 	final  JRadioButton r12 = new JRadioButton("A. all of above "); 
 	
    final JRadioButton r8 = new JRadioButton("A.An a component"); 
    final JRadioButton r14 = new JRadioButton("A.an object with paint method"); 
 	final  JRadioButton r13= new JRadioButton("B.wompat"); 
 	final JRadioButton r15 = new JRadioButton("C. $35"); 
 	final  JRadioButton r16= new JRadioButton("D. none of the above"); 

quiz()
{
	l1.setBounds(10,50,350,20);
    l2.setBounds(10,150,200,20);
    l3.setBounds(10,243,200,20);
    l4.setBounds(10,345,200,20);

    b1.setBounds(250,450,50,50);
    b2.setBounds(300,450,50,50);
    
    r1.setBounds(10,70,350,20);
    r2.setBounds(10,87,350,20);
    r3.setBounds(10,105,350,20);
    
    r4.setBounds(10,170,350,20);
    r5.setBounds(10,185,350,20);
    r6.setBounds(10,202,350,20);
    r7.setBounds(10,220,350,20);
    
   
    r9.setBounds(10,270,350,20);
    r10.setBounds(10,290,350,20);
    r11.setBounds(10,310,350,20); 
    r12.setBounds(10,325,350,20);
    
    r13.setBounds(10,360,350,20);
    r8.setBounds(10,375,350,20);
    r14.setBounds(10,390,350,20);
    r15.setBounds(10,405,350,20);
    r16.setBounds(10,423,350,20);
    
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    
    f.add(b1);
    f.add(b2);
    
    f.add(r1);
   f.add(r2);
   f.add(r3);
   
   f.add(r4);
   f.add(r5);
   f.add(r6);
   f.add(r7);
   
   f.add(r8);
   f.add(r9);
   f.add(r10);
   f.add(r11);
   f.add(r12);
   
   f.add(r13);
   f.add(r14);
   f.add(r15);
   f.add(r16);
   
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(700,700);
  
    ButtonGroup group = new ButtonGroup();
    group.add(r1);
    group.add(r2);
    group.add(r3);
    
    ButtonGroup group1 = new ButtonGroup();
    group1.add(r4);
    group1.add(r5);
    group1.add(r6);
    group1.add(r7);
    ButtonGroup group2= new ButtonGroup();
    group2.add(r9);
    group2.add(r10);
    group2.add(r11);
    group2.add(r12);
    ButtonGroup group3= new ButtonGroup(); 
    group1.add(r8);
    group3.add(r13);
    group3.add(r14);
    group3.add(r15);
    group3.add(r16);
}
public static void main(String...s)

{
	quiz f1=new quiz();
	
}
}