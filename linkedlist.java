import java.util.*;

class sample
  {
     TreeSet<String> l1=new TreeSet<String>();

     sample()
	{
		l1.add("Zebra");
		l1.add("Peacock");
		l1.add("Cock");
		l1.add("Dove");
		l1.add("Cock");




//		l1.set(1,"Eagle");	

 
/*	  	Iterator itr=l1.iterator();

		while(itr.hasNext())
		{
			 System.out.println(""+itr.next());
		}*/


		for(String s:l1)
		{
	   	   System.out.println(""+s);
		}

	}
 }


class linkedlist
 {
  public static void main(String args[])
	{
	    sample obj=new sample();
	}
  }	