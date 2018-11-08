

class simple
  {
    int x,y;
	public void addition(int a,int b)
	{
            x=a;
	    y=b;
	   int tot=x+y;
	    System.out.println("Addition="+tot);
	   System.out.println("Place="+s);
	}

  }


class simple1 extends simple
 {
       int mul;

    public void multiplication(int a,int b)
	{
	   x=a;
	   y=b;
	   mul=x*y;
	   System.out.println("Multiplication="+mul);
	
	}
  }


class demoinher1
  {
     public static void main(String args[])
	{
	   simple1 obj=new simple1();
	     obj.multiplication(2,3);
		obj.addition(1,1);
	}
  }


	/*  inheritance 

			reusability

			
