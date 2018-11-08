

class sample
   { 
      final int x=10;			// maintains its value throught out the program
                                                                                                              public void display()
	{
	   x+=1;
	   System.out.println(""+x);
	}
    }

  class demofinal
    {
	  public static void main(String as[])
	   {
	     sample obj=new sample();

		obj.display();
	   }
     }
