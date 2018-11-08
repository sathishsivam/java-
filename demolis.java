import java.awt.*;
import java.awt.event.*;

class sample extends Frame implements ActionListener
 {
    Button b1;
    sample()
	{
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		b1=new Button("Exit");
		add(b1);
		b1.setBounds(100,100,140,80);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent d)
	{	
		System.out.println(d.getActionCommand());
	   	
	}


 }

class demolis
 {
    public static void main(String ad[])
	{
	   sample obj=new sample();
	}
 }