import java.io.*;

class sample
 {
	int x[][]=new int[3][3],y[][]=new int[3][3],tot[][]=new int[3][3];

	DataInputStream din;

       sample()
	{
		System.out.println("Enter the matrix A");

	 	din=new DataInputStream(System.in);
		for(int i=0;i<3;i++)
		 {
		  for(int j=0;j<3;j++)
		    {
			try{
				x[i][j]=Integer.valueOf(din.readLine()).intValue();
			}catch(IOException d){}
	 	    }	 
		}

		System.out.println("Enter the matrix A");

		for(int i=0;i<3;i++)
		 {
		  for(int j=0;j<3;j++)
		    {
			try{
				y[i][j]=Integer.valueOf(din.readLine()).intValue();
			}catch(IOException d){}
	 	    }	 
		}

		for(int i=0;i<3;i++)
		 {
		  for(int j=0;j<3;j++)
		    {
			tot[i][j]=x[i][j]+y[i][j];
	 	    }	 
		}

		System.out.println("Addition ");
		for(int i=0;i<3;i++)
		 {
		  for(int j=0;j<3;j++)
		    {
			System.out.print(""+tot[i][j]);
	 	    }	 

			System.out.println("");
		}

	}
  }

class demoarray
  {
     public static void main(String arg[])
	{
	   sample obj=new sample();
	}
  }


