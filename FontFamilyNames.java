import java.awt.GraphicsEnvironment;

public class FontFamilyNames 
  {
   public static void main(String[] args) 
	{
		  GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			  String fontNames[] = ge.getAvailableFontFamilyNames();

	     for (int i=0; i<fontNames.length; i++) 
			      {
				     System.out.println(fontNames[i]);
			      }
	 }
   }