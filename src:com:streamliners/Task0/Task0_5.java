import java.util.Scanner;

public class Task0_5 {
    public static void main(String[] args) {
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter two numbers for division");
        int num1=myvar.nextInt();
        int num2=myvar.nextInt();
        System.out.println("Quitient is : "+ num1/num2);
        System.out.println("Remainder is : "+ num1%num2);


        
    }
    
}
