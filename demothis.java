
class sample  
 {
    int x,y,tot;
     public void display(int x, int y)
	{
		this.x=x;
		this.y=y;
		tot=x+y;
	}

	public void show()
	{
		System.out.println("Total="+tot);
	}
  }


 class demothis
   {
      public static void main(String args[])
	{
	   sample obj=new sample();

		obj.display(100,222);
		obj.show();

	}
   }

   

