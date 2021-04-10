import java.util.Scanner;
public class Task0_36 {
    public static void main(String[] args) {
  
      System.out.println("Which is your favourate subject from physics ,maths , chemistry and biology :");
      Scanner myvar =new Scanner(System.in);
      String sub = myvar.nextLine();
      sub=sub.toLowerCase();
  
      switch(sub) {
  
        case "physics":
          System.out.println("Good!! its "+ sub);
          break;
  
        case "maths":
          System.out.println("Good!! its "+ sub);
          break;
  
        case "chemistry":
          System.out.println("Good!! its "+ sub);
          break;

        case "biology":
          System.out.println("Good!!its "+ sub);
          break;  
  
        default:
          System.out.println("enter a valid subject from the given options..");
          break;
      }
    }
  }