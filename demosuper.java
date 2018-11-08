
class sample
 {
     sample(int a,int b)
     {
	  int tot=a+b;
	  System.out.println("Base class cons"+tot);
      }
  }

class sample1 extends sample
   {
       sample1(int x,int y, int z)
	{
	  super(x,y);		// its a method which is used to call the super class constructor
	  int mul=x*y*z;
	  System.out.println("Mulitplication="+mul);
	}
    }

class demosuper
 {
     public static void main(String args[])
	{
	    sample1 obj=new sample1(1,2,3);
	}
  }

    