package lab_assign;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class PizzaOrder
{  
   public static void main(String[] args)        
   {   
      JCheckBox show1;
      JLabel label1;
      JFrame frame = new JFrame();
      JPanel container = new JPanel();
      frame.add(container);
      frame.setTitle("Pizza Shop");
 
      String labels[] = { "Small:$6.50", "Medium:$8.50", "Large:$10.00"};
      JLabel firstLabel = new JLabel("Size");
      JComboBox comboBox1 = new JComboBox(labels);
      container.add(firstLabel);
      container.add(comboBox1);
       
      String labels2[] = { "Thin-crest", "Medium-crest", "Pan"};
      JLabel secondLabel = new JLabel("Pizza Type");
      JComboBox comboBox2 = new JComboBox(labels2);
      container.add(secondLabel);
      container.add(comboBox2);
 
      JLabel thirdLabel = new JLabel("Toppings:");
      container.add(thirdLabel);
      final JRadioButton oneRadio = new JRadioButton("Tomato");    
      container.add(oneRadio);
      final JRadioButton twoRadio = new JRadioButton("Green Pepper");
      container.add(twoRadio);
      final JRadioButton threeRadio = new JRadioButton("Black Olives"); 
      container.add(threeRadio);
      final JRadioButton fourRadio = new JRadioButton("Mushrooms");
      container.add(fourRadio);
      final JRadioButton fiveRadio = new JRadioButton("Extra Cheese");
      container.add(fiveRadio);
      final JRadioButton sixRadio = new JRadioButton("Pepproni");
      container.add(sixRadio);
      final JRadioButton sevenRadio = new JRadioButton("Sausage");
     container.add(sevenRadio);
     
      ButtonGroup group = new ButtonGroup();
      group.add(oneRadio);
      group.add(twoRadio);
      group.add(threeRadio);
      group.add(fourRadio);
      group.add(fiveRadio);
       
      JLabel fourth1Label = new JLabel("Each Toppings:$1.50");
      JTextField Name1 = new JTextField(25);
      container.add(fourth1Label);
      container.add(Name1);
       
      JButton button1 = new JButton("Process Selection");
      container.add(button1);
       
      JPanel southPanel = new JPanel();
      final JLabel label = new JLabel("Your total price");
      southPanel.add(label);
      frame.add(label, BorderLayout.SOUTH);
 
 
      frame.setSize(325, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);  
class Listener implements ActionListener
{
    public void actionPerformed(ActionEvent e) 
    {
      Object selected = comboBox1.getSelectedItem();
         if (selected.toString().equals("Small:$6.50"))
            {
               double price1 = 10.79;
               System.out.println("pop");
            }  
         else  if (selected.toString().equals("Medium:$8.50"))
            {
               double price1 = 12.79;
            }             
         else  if (selected.toString().equals("Large:$10.00"))
            {
               double price1 = 14.79;
            }          
      Object selected1 = comboBox2.getSelectedItem();
         if (selected1.toString().equals("Thin-crest"))
            {
               String crust = "Thin-crest";
            }
         else if(selected1.toString().equals("Medium-crest"))
            {
               String crust = "Medium-crest";
            }         
         else if(selected1.toString().equals("Pan"))
            {
               String crust = "Pan";
            }      
 class ClickListener implements ActionListener 
      {
         public void actionPerformed(ActionEvent event)
         {  
 
          if(oneRadio.isSelected())
            {
               double price = 1.75;
               label.setText("Freshman");
            }
          else if(twoRadio.isSelected())
            {
               double price = 3.50;
            }
          else if(threeRadio.isSelected())
            {
               double price = 5.25;
            }
          else if(fourRadio.isSelected())
            {
               double price = 7.00;
            }
          else if(fiveRadio.isSelected())
            {
               double price = 8.75;
            }
    }
    }
    ActionListener listener = new ClickListener(); 
    button.addActionListener(listener);    
    } 
  }
 }
}
