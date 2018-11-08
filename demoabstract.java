/*
Abstract class

     class may have several methods but atleast one method is un implemented */


 abstract  class sample
    {
        public void display()
	 {
	    System.out.println("salem");	
	}	// method implementation

        public void display1()
  	 {	
	    System.out.println("salem tamilnadu");	
	 }

	abstract public void show();		// method declaration
	abstract public void show1();		// method declaration
	abstract public void show2();		// method declaration
	abstract public void show3();		// method declaration


    }

  class sample1 extends sample
	{
	   public void show()
		 {
		    System.out.println("India");	
		 }

	   public void show1()
		 {
		  
		 }
	   public void show2()
		 {
		  
		 }
	   public void show3()
		 {
		  
		 }


        }



 class demoabstract
  {
    public static void main(String args[])
	{
	    sample1 obj=new sample1();

		obj.display();
		obj.display1();
		obj.show();

	}
  }