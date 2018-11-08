import java.io.*;
import javax.swing.*;
import java.awt.*;


//<applet code="TamilFont.class" width=400 height=400></applet>

public class TamilFont extends JApplet 
{
	public void init()
	{
		String content="\u0BB5\u0BA3\u0B95\u0BCD\u0B95\u0BAE\u0BCD";
		Container container=getContentPane();
			container.setLayout(new FlowLayout());
			JLabel label1=new JLabel();
			label1.setFont(new Font("Latha",Font.PLAIN,12));
			label1.setText(content);
		container.add(label1);
	}
 }