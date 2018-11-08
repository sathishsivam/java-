

class sample
  {
     String name;
     int age;
     static String city="Salem";


     sample(String n,int a)
	{
	 name=n;
	 age=a;
	}

     public static void output()
	{
	   System.out.println(""+name);
	   System.out.println(""+age);
	   System.out.println(""+city);
	}
  }
 
 class demostaticc
   {
     public static void main(String args[])
	 {
            sample obj=new sample("sathish",34);
	    sample obj1=new sample("santhosh",34);
		sample.output();
		sample.output();
	}
   }        
