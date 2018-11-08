
class Callme 
 {
      public void call(String msg) 			// shared resource
	{
	 	System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		   } catch(InterruptedException e) { }
			 System.out.println("]");

        }
 }


class Caller extends Thread
 {
	String msg;
	Callme target;
        Thread t;


        Caller(Callme targ, String s) 
         {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

       public void run() 
         {
  		target.call(msg);
	}
    }


class demosynch 
 {
     public static void main(String args[]) 
        {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "i18n");
		Caller ob2 = new Caller(target, "Solutions");
		Caller ob3 = new Caller(target, "Centre of Excellence");
   }
}


		