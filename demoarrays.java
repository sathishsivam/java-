import java.util.*;

class demoarrays
  {
    public static void main(String args[])
	{
	  String a[]=new String[]{"php","html","css","js","java"};

	  List<String > l1=new ArrayList<>(Arrays.asList(a));

	  l1.remove(3);
 	  System.out.println(""+l1);
	}
 }

		


  

	


