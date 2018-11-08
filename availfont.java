
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class availfont 
 {
  public static void main(String[] a) 
	{
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		    Font[] fonts = ge.getAllFonts(); // Get the fonts

		    for (Font f : fonts) 
			{
			      System.out.println(f.getFontName());
		        }
		
	  }
}