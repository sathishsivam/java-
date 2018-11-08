class count
 {
    public static void main(String asd[])
	{
	   String s="abcabcdeddeio";
	   char c[]=s.toCharArray(); 

           int z=c.length;

	    int i=0,j=0,count=0;

            for(i=0;i<z;i++)
		{
                   count=0;
  		   for(j=0;j<z;++j)
		     {
                          if(c[j]==c[i])
			    {
				//count++;
			    }
		     }

//			System.out.println("The character\t"+c[i]+"\tis present"+count+"times");
                }
        }
}