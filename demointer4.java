interface one
  { 
     public void show();

     default void display()
	{
	   System.out.println("implementation in interface method");
	}	


   }


 class sample implements one
   {
     public void show()
	{
		
	}
    }


class demointer4
  {
     public static void main(String args[])
	{
	  sample obj=new sample();
	  obj.show();
	  obj.display();
	 sample.doagain();
	}
 }	    
   