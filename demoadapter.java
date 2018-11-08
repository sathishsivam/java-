import java.awt.*;
import java.awt.event.*;
import java.util.*;

class sample extends MouseAdapter
   {
      Frame f=new Frame();

      sample()
	{
	 	f.setVisible(true);
		f.setSize(1600,1600);
 		f.addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent s)
	{
		System.out.println("Mouse dragged");
	}

	public void mouseMoved(MouseEvent s)
	{
		System.out.println("Mouse Moved");
	}
   }


 class demoadapter
   {
     public static void main(String args[])
	{
	   sample obj=new sample();
	}
   }

