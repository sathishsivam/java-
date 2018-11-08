

class sample implements Cloneable
  {
     sample(String str)
	{
	   System.out.println(""+str);
	}

     public Object Clone() throws Exception
	{
		return super.clone();
	}

  }


class democlone
  {
     public static void main(String args[]) throws Exception
	{
  	   sample obj=new sample("sathish");

           sample ob1= (sample)obj.clone();

	}
 }