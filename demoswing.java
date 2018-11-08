import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class sample extends JFrame implements ActionListener
   {
      JButton b1;
      JProgressBar pb;
      sample()
	{
	  setLayout(null);
	  setVisible(true);
	  setSize(1500,750);
	  b1=new JButton("Submit");
	  add(b1);
          b1.setBounds(120,120,120,40);	
	  b1.addActionListener(this);

	  pb=new JProgressBar(0,1000);
	  add(pb);
	  pb.setBounds(140,450,230,50);

	  pb.setValue(0);

	  Color c1=JColorChooser.showDialog(this,"Select your color",Color.RED);
	  getContentPane().setBackground(c1);
	  b1.setBackground(c1);
	}

	

	public void actionPerformed(ActionEvent d) 
	{
	
         }
   }


class demoswing
  {
	public static void main(String args[])
	{
	    sample obj=new sample();

	}
 }
  
/*
		Awt  			swing

	Heavy weight components		light weight components
	
	extract the UI from OS 
	libraries			jdk libraries

	components limited		....

	import java.awt.*	 	import javax.swing.*


					JFC	(Java Foundation Class)	

					plf	(Plugable Look and Feel)

		
*/



