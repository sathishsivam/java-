

   class student				//super class
	{
	    String name;
	    int age,roll;
   
 	    public void getstudent(String n,int a,int r)
	       {
			name=n;
			age=a;
			roll=r;

	         System.out.println("Name="+name);
	         System.out.println("Roll="+roll);
	         System.out.println("Age="+age);
		}
       }


   class employee extends student				// derived class	
     {
        String desig="software engineer";

	public void getemployee(String n, int a,int r)
	{
		name=n;
		age=a;
		roll=r;
		
		  System.out.println("Designation="+desig);
		  System.out.println("Employee Name="+name);
        	  System.out.println("emp id="+roll);
	          System.out.println("emp Age="+age);
	
	}
  }


    class demoinher			
    {
       public static void main(String args[])
	{
	  employee obj1=new employee();

		obj1.getstudent("Abirami",1,1);
		obj1.getemployee("santhosh",28,02);

	}
    }	    


 


 

	
        




		


       