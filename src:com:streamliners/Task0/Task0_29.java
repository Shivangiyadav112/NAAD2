import java.util.Scanner;

public class Task0_29 {
     public static void main(String[] args) {
            Scanner myvar=new Scanner(System.in);
            System.out.println("Enter two strings for comparison");
            String str1 = myvar.nextLine();
            String str2 = myvar.nextLine();
    
            if(str1.equals(str2))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
        }
   
    
}
