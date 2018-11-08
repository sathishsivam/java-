import java.io.*;

   class sample 
     {
     	DataInputStream din=new DataInputStream(System.in);

	 public void display()
	{
		System.out.println("Enter the value");

		try{
			int x=Integer.parseInt(din.readLine());   	

			int y=Integer.parseInt(din.readLine());   	

			int tot=x+y;

			System.out.println(""+tot);
		
		   }catch(IOException d){}

		
	}
     }

   class demoinput
    {
	public static void main(String args[])
	{
	   sample obj=new sample();
		obj.display();
	}
    }


