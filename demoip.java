import java.net.*;

class sample
  {
    sample()
	{
	  try{
		  System.out.println(""+InetAddress.getByName("www.google.com"));
		
		}catch(Exception d){}

	}
  }


class demoip
 {
    public static void main(String a[])
	{
	   sample obj=new sample();
	}
 }