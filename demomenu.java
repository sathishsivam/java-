import java.awt.*;

class sample extends Frame
 {
   MenuBar mbar;

    sample()
	{

          mbar=new MenuBar();
	  setMenuBar(mbar);

	  Menu file=new Menu("Admin");

	  MenuItem fm1=new MenuItem("Monitoring ");
	  file.add(fm1);
	
	  MenuItem fm2=new MenuItem("Registration");
	  file.add(fm2);

	  MenuItem fm3=new MenuItem("Service");
	  file.add(fm3);

	  MenuItem fm4=new MenuItem("Release");
	  file.add(fm4);
	  

	  mbar.add(file);	


									// second menu

	  Menu ufile=new Menu("User");

	  MenuItem um1=new MenuItem("Learning  ");
	  ufile.add(um1);
	
	  MenuItem um2=new MenuItem("Assignment");
	  ufile.add(um2);

	  MenuItem um3=new MenuItem("Test");
	  ufile.add(um3);

	  MenuItem um4=new MenuItem("Results");
	  ufile.add(um4);
	  

	  mbar.add(ufile);	

	  setVisible(true);
	  setSize(500,500);

	}
 }


class demomenu
 {
    public static void main(String args[])
	{
	   sample obj=new sample();
	}
 }
