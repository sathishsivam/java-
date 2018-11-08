import java.io.*;

class sample
 {
     int x[][]=new int[3][3];

    DataInputStream din=new DataInputStream(System.in);
    public void geta()
	{
	   for(int i=0;i<3;i++)
		{
	           for(int j=0;j<3;j++)
			{
			 try{
		                 x[i][j]= Integer.valueOf(din.readLine()).intValue();
			  }catch(IOException s){}
			}
		}	    

	}

   public void display()
	{
	   for(int i=0;i<3;i++)
		{
	           for(int j=0;j<3;j++)
			{

				System.out.print(x[i][j]);
			}
				System.out.println("");
		}	    

	}
 }

class demomat
  {
     public static void main(String ad[])
	{
	    sample obj=new sample();
		obj.geta();
		System.out.println("output");
		obj.display();
	}
 }