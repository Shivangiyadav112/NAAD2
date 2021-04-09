import java.util.Random;
import java.util.Scanner;

public class Task0_32 {
  public static void main(String[] args) {

   
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder sb = new StringBuilder();

    Random random = new Random();
    System.out.println("Enter the size of random string");
    Scanner myvar = new Scanner(System.in);
    int length = myvar.nextInt();

    for(int i = 0; i < length; i++) {

      int index = random.nextInt(alphabet.length());
      char randomChar = alphabet.charAt(index);
       sb.append(randomChar);
    }

    String randomString = sb.toString();
    System.out.println("Random String is: " + randomString);

  }
}
