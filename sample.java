class sample
 {
   public static String palindromeLoop(String str) 
    {
    	String original = str;
        String reverse = "";

	    for (int i = str.length() - 1; i >= 0; i--)
		 {
		        reverse = reverse + original.charAt(i);
		 }

    if (original.equals(reverse))
     {
        return "The String is a Palindrome";
     } 
   else
    {
        return "Not a Palindrome!!!";
    }
 }
}