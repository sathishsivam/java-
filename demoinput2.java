
import java.io.*;

 class sample
  {

    DataInputStream din=new DataInputStream(System.in);

     public void display() 	
	{
	   try{
			int x=Integer.valueOf(din.readLine()).intValue();
			float y=Float.valueOf(din.readLine()).floatValue();
	 }catch(Exception d){}
	}
  }


class demoinput2
  {
      public static void main(String args[])
	{
		sample obj=new sample();

		obj.display();
	}
  }