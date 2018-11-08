import java.util.*;


class sample 
 {
    Date d=new Date();
    Currency c;


     sample()
	{
		  System.out.println("Date"+d);
		  System.out.println(""+d.getTime());

		  c=Currency.getInstance(Locale.UK);

		  System.out.println(""+c.getCurrencyCode());

		  System.out.println(""+c.getSymbol());

	}
 }


class demodate
 {
     public static void main(String arg[])
	{
	 sample obj=new sample();
	}
 }
