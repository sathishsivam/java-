
interface one
   {
      public void show();
   }


interface two
   {
      public void show1();
   }



  class sample1 implements one,two 
   {
	 sample1()
	  {

   	  }
	public void show()
         {
	   System.out.println("from interface");
         }

	public void show1()
         {
	   System.out.println("from interface");
         }

   }


  class demointerface
	{
	   public static void main(String args[])
		{
	          sample1 obj=new sample1();

		obj.show();
		obj.show1();

		}
    }
	


