import java.util.*;

class sample
  {

    ArrayList a1=new ArrayList();


     sample()
	{
		a1.add("Java");
		a1.add("python");
		a1.add("C++");
		a1.add("C");

		Iterator itr=a1.iterator();

		while(itr.hasNext())
		{
		  System.out.println(""+itr.next());
		}
	}
  }

class arraylist
  {
     public static void main(String argf[])
	{
	   sample obj=new sample();
	 }
 }