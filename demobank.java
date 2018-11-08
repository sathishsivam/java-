 class customer
   {
	int amount=5000;

	synchronized void withdraw(int amt)
	    {
	        System.out.println("go to withdraw");

               if(this.amount<amt)
		{
		     System.out.println("less balance;waiting for deposit...");
		         try{
			wait();

		              }catch(InterruptedException h){}
		                 this.amount-=amount;
                                          System.out.println("withdraw completed");
			
		 }
                        }
	  synchronized void deposit(int deposit)
	         {
		System.out.println("going to deposit");
	                       this.amount+=amount;
		System.out.println("deposit completed");
		       //notifyAll();
	        }
  }

 class demobank
    { 
	public static void main(String args[])
	   {
	        customer c=new customer();

				
               new Thread()
		{
		       public void run()
		          {
	                               c.withdraw(15000);
		          }
                 }.start();
		
                new Thread()
                 {
			public void run()
			 {
	  		   	 c.deposit(5000);
	                  }
                 }.start();
	   }
}
		       
                 