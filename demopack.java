import pack.*;

class sample extends hi
  {
      public void show()
	{
	  System.out.println("form clasS");
	}
  }

class demopack
 {
    public static void main(String args[])
	{
	   sample obj=new sample();
		obj.show();
		System.out.println(obj.addition(12,12));
	}
  }