
 class sample extends sample1 implements Runnable
   {
	Thread t=new Thread(this);

     sample()
	{
	   t.start();
	   System.out.println(""+t.getName());
	}

     public void run()
	{
	   for(int i=0;i<10;i++)
		{
	           System.out.println("From child thread"+i);
		  try{
		   t.sleep(1000);
		 }catch(InterruptedException d){}
					
		}
	}
   }


 class demothread
   {
      public static void main(String args[])
	{
	    sample obj=new sample();
		
		Thread t=Thread.currentThread();

		System.out.println(""+t.getName());

		for(int i=0;i<10;i++)
		{
	             System.out.println("From main thread"+i);
		   try{
			     t.sleep(1000);
			}catch(InterruptedException dd){}
		}
		
	}
   }


/*
   class Thread 


	States of the thread		methods

	Born				start()

	Running 			run()

	idle				sleep()
	dead				stop()*/
