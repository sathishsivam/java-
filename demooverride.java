/*
	  method overridding  
    A method in the derived class share the same name and type signature of the method in the super class|base class, then we call that the method in the derived class overrides the method in the super class
*/


   class sample					// super class
    {
       public void display(String str)
	{
	  System.out.println("Baseclassmethod"+str);
 	}
     }


   class sample1 extends sample			// derived class
	{
	   public void display(String str)
		{
		  System.out.println("Derived class method"+str);
		}
      }
	   

  class demooverride
    {
       public static void main(String args[])
	{

	   sample ref;

	   sample obj=new sample();
 	   sample1 obj1=new sample1();

	   ref=obj;
	   ref.display("salem");

	}
  }




