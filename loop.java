import java.util.*;
import java.io.*;

   class sample
    {
	int x[]=new int[10];
	DataInputStream din;

      sample()
	{
	   din=new DataInputStream(System.in);

	    for(int i=0;i<10;i++)
		{
                   try{
			   x[i]= Integer.parseInt(din.readLine());
			}catch(IOException d){}
		}
        }
    }


  class  loop
   {
      public static void main(String args[])
	{
	   sample obj=new sample();
	}
   }
