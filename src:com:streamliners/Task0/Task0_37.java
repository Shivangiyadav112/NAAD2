import java.util.Scanner; 
public class Task0_37 {
    public static void main(String[] args) {
      Scanner myvar=new Scanner(System.in);
      System.out.println("Enter a string :");
      String txt = myvar.nextLine();
      System.out.println("Enter a word to check if it is in the entered string");
      String str1 = myvar.nextLine();
      
      boolean result = txt.contains(str1);
      if(result) 
              System.out.println(str1 + " is present in the entered string.");
      
      else 
        System.out.println(str1 + " is not present in the entered string.");
      
    }
}