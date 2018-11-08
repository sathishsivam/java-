
 class sample
   {

	public void display(int x,int y)
	{
		if((x<y) || (y==3))
		{
	          System.out.println("x is greater than y");
		}
		
		
	}
   }

class demodata
 {
      public static void main(String arfs[])
	{
	   sample obj=new sample();
	    obj.display(0,2);
	}
 }