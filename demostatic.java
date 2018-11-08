
class sample
  {
     String name;
     int age;
     static String company="Mayukam";

     sample(String nam,int a)
	{
	    name=nam;
	    age=a;
	     
        }
 
     public void output()
 	{
	      System.out.println(""+name);
	      System.out.println(""+age);
	      System.out.println(""+company);	     
	}

	
  }

class demostatic
  {
    public static void main(String args[])
	{
	   sample obj=new sample("sathish",40);
	   sample obj1=new sample("Santhosh",30);
		obj.output();
		obj1.output();
	  } 
 }
