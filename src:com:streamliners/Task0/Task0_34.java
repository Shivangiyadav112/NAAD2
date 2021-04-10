import java.util.Scanner;
public class Task0_34 {
    public static void main(String[] args) {
  
      Scanner myvar=new Scanner(System.in);
      System.out.println("Enter a string : ");
      String str = myvar.nextLine();
  
      System.out.println("Characters in " + str + " are:");
      for(int i = 0; i<str.length(); i++) {
        char a = str.charAt(i);
        System.out.print(a + ", ");
      }
    }
  }
