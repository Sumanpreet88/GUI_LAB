package lab_assign;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calci_front_end 
{
	Frame f= new Frame();
	Label l1= new Label("Airtel 4G");
	Label l2= new Label("11:34am");
	Label l3= new Label("66%");
	
	 Button b1=new Button("(");
	 Button b2=new Button(")");
	 Button b3=new Button("mc");
	 Button b4=new Button("m+");	
	 Button b5=new Button("m-");
	 Button b6=new Button("mr");
	 Button b7=new Button("AC");
	 Button b8=new Button("+/-");
	 Button b9=new Button("%");
	 Button b10=new Button("/");
	 
	 Button b11=new Button("2nd");
	 Button b12=new Button("x^2");
	 Button b13=new Button("x^3");
	 Button b14=new Button("x^y");
	 Button b15=new Button("e^x");
	 Button b16=new Button("10^x");
	 Button b17=new Button("7");
	 Button b18=new Button("8");
	 Button b19=new Button("9");
	 Button b20=new Button("*");
	 
	 Button b21=new Button("1/x");
	 Button b22=new Button("2x");
	 Button b23=new Button("3x");
	 Button b24=new Button("yx");
	 Button b25=new Button("ln");
	 Button b26=new Button("log10");
	 Button b27=new Button("4");
	 Button b28=new Button("5");
	 Button b29=new Button("6");
	 Button b30=new Button("-");
	 
	 Button b31=new Button("sin");
	 Button b32=new Button("cos");
	 Button b33=new Button("tan");
	 Button b34=new Button("e");
	 Button b35=new Button("EE");
	 Button b36=new Button("1");
	 Button b37=new Button("2");
	 Button b38=new Button("3");
	 Button b39=new Button("+");
	 Button b49=new Button("x!");
	 
	 Button b40=new Button("deg");
	 Button b41=new Button("sinh");
	 Button b42=new Button("cosh");
	 Button b43=new Button("tanh");
	 Button b44=new Button("pi");
	 Button b45=new Button("Rand");
	 Button b46=new Button("0");
	 Button b47=new Button(".");
	 Button b48=new Button("=");	 

calci_front_end()
{                      
	b1.setBounds(10,40,40,30);
    b2.setBounds(50,40,40,30);
    b3.setBounds(90,40,40,30);
    b4.setBounds(130,40,40,30);
    b5.setBounds(170,40,40,30);
    b6.setBounds(210,40,40,30);
    b7.setBounds(250,40,40,30);
    b8.setBounds(290,40,40,30);
    b9.setBounds(330,40,40,30);
    b10.setBounds(370,40,40,30);
    
    b11.setBounds(10,70,40,30);
    b12.setBounds(50,70,40,30);
    b13.setBounds(90,70,40,30);
    b14.setBounds(130,70,40,30);
    b15.setBounds(170,70,40,30);
    b16.setBounds(210,70,40,30);
    b17.setBounds(250,70,40,30);
    b18.setBounds(290,70,40,30);
    b19.setBounds(330,70,40,30);
    b20.setBounds(370,70,40,30);
    
    b21.setBounds(10,100,40,30);
    b22.setBounds(50,100,40,30);
    b23.setBounds(90,100,40,30);
    b24.setBounds(130,100,40,30);
    b25.setBounds(170,100,40,30);
    b26.setBounds(210,100,40,30);
    b27.setBounds(250,100,40,30);
    b28.setBounds(290,100,40,30);
    b29.setBounds(330,100,40,30);
    b30.setBounds(370,100,40,30);
    
    
    b31.setBounds(10,130,40,30);
    b32.setBounds(50,130,40,30);
    b33.setBounds(90,130,40,30);
    b34.setBounds(130,130,40,30);
    b35.setBounds(170,130,40,30);
    b36.setBounds(210,130,40,30);
    b37.setBounds(250,130,40,30);
    b38.setBounds(290,130,40,30);
    b39.setBounds(330,130,40,30);
    b40.setBounds(370,130,40,30);
    
    b41.setBounds(10,160,40,30);
    b42.setBounds(50,160,40,30);
    b43.setBounds(90,160,40,30);
    b44.setBounds(130,160,40,30);
    b45.setBounds(170,160,40,30);
    b46.setBounds(210,160,80,30);
    b47.setBounds(290,160,40,30);
    b48.setBounds(330,160,40,30);
    b49.setBounds(370,160,40,30);
    
    l1.setBounds(10,10,100,10);
    l2.setBounds(200,10,100,10);
    l3.setBounds(400,10,100,10);
    
	f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5); 
	f.add(b6); f.add(b7); f.add(b8); f.add(b9); f.add(b10);  
	
	f.add(b11); f.add(b13); f.add(b15); f.add(b17); f.add(b19); 
	f.add(b12); f.add(b14); f.add(b16); f.add(b18); f.add(b20); 
	
	f.add(b21); f.add(b22); f.add(b23); f.add(b24); f.add(b25); 
	f.add(b26); f.add(b27); f.add(b28); f.add(b29); f.add(b30); 
	
	f.add(b31); f.add(b32); f.add(b33); f.add(b34); f.add(b35); 
	f.add(b36); f.add(b37); f.add(b38); f.add(b39); f.add(b49); 
	
	f.add(b41); f.add(b42); f.add(b43); f.add(b44); f.add(b40);
	f.add(b45); f.add(b46); f.add(b47); f.add(b48); 
	
	f.add(l1); f.add(l2); f.add(l3);
	
	f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,300);
	
}

public static void main(String...s)
{
	 new calci_front_end();
}
}

