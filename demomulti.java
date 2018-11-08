import java.io.*;

class sample
  {
       int x[][]=new int[3][3];

	DataInputStream din=new DataInputStream(System.in);

	sample()
	{
	    for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
			{
			   try{
		 		     x[i][j]=Integer.parseInt(din.readLine());
				}catch(IOException d){}
			}
		}
	}
 
  }

class demomulti
  {
     public static void main(String args[])
	{
	   sample obj=new sample();
	}
  }



   