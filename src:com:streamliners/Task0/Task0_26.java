import java.util.Scanner;
public class Task0_26 {

    public static void main(String[] args) {
      Scanner myvar=new Scanner(System.in);
      System.out.println("enter number of rows");
      int rows= myvar.nextInt();  
      int k=0;
      for (int i = 1; i <= rows; i++, k = 0) {
        for (int space = 1; space <= rows - i; space++) {
          System.out.print("  ");
        }
  
        while (k != 2 * i - 1) {
          System.out.print("* ");
          ++k;
        }
  
        System.out.println();
      }
    }
  }