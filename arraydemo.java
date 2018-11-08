
import java.io.*;

 class sample
  {
        int x[]=new int[5];

	DataInputStream din=new DataInputStream(System.in);

     sample() 
	{
		for(int i=0;i<5;i++)
		{

			try{
		 	    	x[i]= Integer.valueOf(din.readLine()).intValue();			
			  }catch(IOException d){}
		 
		}
	}

   }


class arraydemo
  {
    public static void main(String args[])
	{
		
	 sample obj=new sample();	
	}
  }

			