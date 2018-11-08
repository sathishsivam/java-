
public class TPattern 
 {
	public static void Trapezium()
	{
	    int n=4, i=1,k=1,s=0,num=1,number=n;


		for(i=0;i<n;i++)
		{
		   System.out.println();
		  for(int j=1;j<=s;j++)
			{
	 		  System.out.print("-");
			}

		  for(int m=1;m<2*n-s;m++)
			{
			   if(m%2==0)
			   	System.out.print("*");
			   else
				System.out.print(num++);
			}

			System.out.print("*");

		for(int l=1;l<2*n-s;l++)
			{
			   if(l%2==0)
				   System.out.print("*");
			   else
		  	   {
				System.out.print(k+number*number);
				k++;
			  }
		       }
			number--;
			s=s+2;
		}
	}

	public static void main(String[] args) 
		{
			TPattern.Trapezium();

		}
}