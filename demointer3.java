
  interface one
    {
	public void show();
	default void show1(){}
    }

  class sample implements one
    {
	public void show()
	{
	   System.out.println("from interface");	
	}
    }

   class demointer3
    {
       public static void main(String args[])
	{
	   sample obj=new sample();

		obj.show();
		obj.display();

		int x=one.doit(2);
		System.out.println(""+x);
	}
     }
        