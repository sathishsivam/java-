import java.awt.*;
import java.awt.event.*;


 class sample extends Thread
   {
      sample()
	{
	   Frame f=new Frame();
	  

	   f.setVisible(true);
	   f.setSize(300,300);
	   f.setBackground(Color.cyan);

	}
    }


class democon
  {
     public static void main(String d[])
	{
	    sample obj=new sample();
	}
  }