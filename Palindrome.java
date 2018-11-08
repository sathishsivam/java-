public class Palindrome {
    public static void main(String[] args) {
        int n = 525;
        int rev = 0;
        int temp;
        System.out.println(n);
        temp = n;
        while (temp != 0) // use while loop to check a given condition
        {
            rev = rev * 10;
            rev = rev + temp % 10;
            temp = temp / 10;
        }
        if (n == rev)
            System.out.println("The number is palindrome:" + n);//  display the number is plandrome
                                                                     
        else
            System.out.println("The number is not palindrome:" + n);  //display the number isn't   palindrome
                                                                     
    }
}