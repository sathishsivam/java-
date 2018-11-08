
interface one
  {
      public void show(); 

Default

  }

 class sample implements one
  {
      public void display()
	{
	  System.out.println("from class");
	}

      public void show()
	{
	  System.out.println("from interface to sample");
	}
	
  }

 class sample1 implements one
  {
      public void show()
	{
	  System.out.println("from interface to sample1 ");
	}
	
  }

 class demointer2
  {
    public static void main(String args[])
	{
	   one obj=new sample1();
	    obj.show();
	}
  }
		
	

 class to class (extends)   interface to interface (extends)    interface to class (implements)