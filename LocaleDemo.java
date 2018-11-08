import java.util.*;

public class LocaleDemo {
   public static void main(String[] args) {

      // create a new locale
      Locale locale = new Locale("ENGLISH", "IND");

      // print this locale
      System.out.println("Locale1:" + locale);

      // print the country of this locale
      System.out.println("Country:" + locale.getCountry());
   }
}