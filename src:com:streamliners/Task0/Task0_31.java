import java.util.Arrays;
import java.util.Scanner;

public class Task0_31 {
  public static void main(String[] args) {

  
    Scanner myvar = new Scanner(System.in);
    System.out.print("Enter first String: ");
    String str1 = myvar.nextLine();
    System.out.print("Enter second String: ");
    String str2 = myvar.nextLine();

    
    if(str1.length() == str2.length()) {

      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

     
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(" String are anagram.");
      }
      else {
        System.out.println("Strings  are not anagram.");
      }
    }
    else {
      System.out.println( "Strings are not anagram.");
    }

   
  }
}

