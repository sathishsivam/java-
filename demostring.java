
class sample
  {
     int x=10;

     StringBuilder sb=new StringBuilder("Santhosh");	

     String obj=new String("My State is TamilnadU");
     String obj1=new String("My city is Salem");

     sample()
	{

	   System.out.println(""+obj.toLowerCase());
	   System.out.println("Length of the string ="+obj.length());

	   System.out.println("Character at"+obj.charAt(3));
	   System.out.println(""+obj.trim());

	   System.out.println(""+obj.replace("y","i"));
	
   	   String con=obj.concat(obj1);
	   System.out.println(""+con);

	//   System.out.println(""+sb.reverse());
		
	   System.out.println(""+sb.append("Thangavel"));

	   System.out.println(""+sb.deleteCharAt(0));

	   System.out.println(""+sb.capacity());

	}
  }

class demostring
  {
     public static void main(String ar[])
	{
	   sample obj=new sample();
	}
  }
/*
			My State is   Tamilnadu
			012345678901112*/
