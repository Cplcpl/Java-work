import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PhoneDialer implements ActionListener
{
	int num = 0;
	String number = ""; 
	JFrame dialerWindow;
	
	JButton button_0;
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JButton button_4;
	JButton button_5;
	JButton button_6;
	JButton button_7;
	JButton button_8;
	JButton button_9;
	JButton dash;
	JButton dial;
	
	public static void main(String[] args) 
	{
		new PhoneDialer();
		
	}
	
	public PhoneDialer()
	{
		//Creates Frame
		JFrame dialerWindow = new JFrame();
		dialerWindow.setTitle("Dialer");
		dialerWindow.setSize(200, 250);
		dialerWindow.setLocation(200, 300);
		dialerWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dialerWindow.setVisible(true);
				
		//JPanel
		JPanel buttons = (JPanel)dialerWindow.getContentPane();
			    
		//Sets Layout
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.Y_AXIS)); 
			  	
		//Sets Border
		Border border = BorderFactory.createEmptyBorder(10,10,10,10);
		buttons.setBorder(border);
			  	
		//Title Panel
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
			  
		JLabel label = new JLabel("Enter the number to dial:");
		titlePanel.add(label);
		
		//buttons Panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 3, 5, 5));
		Border border2 = BorderFactory.createEmptyBorder(5,5,5,5);
		buttonPanel.setBorder(border2);
		
		//Create Buttons
		button_0 = new JButton("0");
		button_1 = new JButton("1");
		button_2 = new JButton("2");
		button_3 = new JButton("3");
		button_4 = new JButton("4");
		button_5 = new JButton("5");
		button_6 = new JButton("6");
		button_7 = new JButton("7");
		button_8 = new JButton("8");
		button_9 = new JButton("9");
			    
		dash = new JButton("-");
		
		//Add actionListeners
		button_0.addActionListener(this);
		button_1.addActionListener(this);
		button_2.addActionListener(this);
		button_3.addActionListener(this);
		button_4.addActionListener(this);
		button_5.addActionListener(this);
		button_6.addActionListener(this);
		button_7.addActionListener(this);
		button_8.addActionListener(this);
		button_9.addActionListener(this);
		dash.addActionListener(this);
		
		//Add Buttons to panel
		buttonPanel.add(button_1);
		buttonPanel.add(button_2);
		buttonPanel.add(button_3);
		buttonPanel.add(button_4);
		buttonPanel.add(button_5);
		buttonPanel.add(button_6);
		buttonPanel.add(button_7);
		buttonPanel.add(button_8);
		buttonPanel.add(button_9);
		buttonPanel.add(dash);
		buttonPanel.add(button_0);
		
		//Add Dial Button
		dial = new JButton("Dial Number");
		dial.setAlignmentX(Component.CENTER_ALIGNMENT);
		dial.addActionListener(this);
		
		//Add Panels to JFrame
		dialerWindow.add(titlePanel);
		dialerWindow.add(buttonPanel);
		dialerWindow.add(dial);
		
	}
	public void actionPerformed( ActionEvent event)
	   {
	      Object control = event.getSource();
	      
	      if (control == dial && num == 10 )
	      {
	    	  JOptionPane.showMessageDialog(dialerWindow, "Dialing : " + number);
	    	  num = 0;
	    	  number = "";
	      }
	      else if (control == dial && num != 10 )
	      {
	    	  JOptionPane.showMessageDialog(dialerWindow, "Please enter the full number. ");
	      }
	      else if (control == button_0)
	      {
	    	  number = number + '0';
	      }
	      else if (control == button_1)
	      {
	    	  number = number + '1';
	      }
	      else if (control == button_2)
	      {
	    	  number = number + '2';
	      }
	      else if (control == button_3)
	      {
	    	  number = number + '3';
	      }
	      else if (control == button_4)
	      {
	    	  number = number + '4';
	      }
	      else if (control == button_5)
	      {
	    	  number = number + '5';
	      }
	      else if (control == button_6)
	      {
	    	  number = number + '6';
	      }
	      else if (control == button_7)
	      {
	    	  number = number + '7';
	      }
	      else if (control == button_8)
	      {
	    	  number = number + '8';
	      }
	      else if (control == button_9)
	      {
	    	  number = number + '9';
	      }
	   }
}
