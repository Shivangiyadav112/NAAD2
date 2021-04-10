//wap tp print ascii value of character
import java.util.Scanner;

public class Task0_4 {
    public static void main(String[] args) {
        Scanner myvar = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = myvar.next().charAt(0);
        int ascii= ch;
        System.out.println("ASCII value is : "+ ascii);
    }   
}
