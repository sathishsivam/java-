import java.io.*;

class sample
 {
   int x[][]=new int[3][3],y[][]=new int[3][3],
   tot[][]=new int[3][3];

   DataInputStream din=new DataInputStream(System.in);
   
    sample()
     {

	System.out.println("Enter the matrix A");

	for(int i=0;i<3;i++) 
	  {

	   try{
	    for(int j=0;j<3;j++)
	       {
                 x[i][j]= Integer.valueOf(din.readLine()).intValue();
		}
		}catch(IOException d){}
          }


	System.out.println("Enter the matrix B");

	for(int i=0;i<3;i++) 
	  {

	   try{
	    for(int j=0;j<3;j++)
	       {
                 y[i][j]= Integer.valueOf(din.readLine()).intValue();
		}
		}catch(IOException ad){}
          }


	for(int i=0;i<3;i++) 
	  {
	    for(int j=0;j<3;j++)
	       {
     		  tot[i][j]= x[i][j]+y[i][j] ;
		}
	  }

	for(int i=0;i<3;i++) 
	  {
	    for(int j=0;j<3;j++)
	       {
     		  System.out.print(""+tot[i][j]) ;
		}

	    System.out.println("");
	  }




      }

  }


class matrix
  {
     public static void main(String args[])
 	{
	    sample obj=new sample();
	}
 }