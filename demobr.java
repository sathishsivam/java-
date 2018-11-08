import java.io.*;

class sample
  {
     BufferedReader br;

      sample()
	{
	   br=new BufferedReader(new InputStreamReader(System.in));
	   try{
		System.out.println(""+br.readLine());
		}catch(IOException d){}
	}
  }


class demobr
  {
     public static void main(String ar[])
	{
	    sample obj=new sample();
	}
    }