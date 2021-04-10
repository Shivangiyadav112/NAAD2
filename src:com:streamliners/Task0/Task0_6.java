import java.util.Scanner;

public class Task0_6 {
    public static void main(String[] args) {
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter two numbers ");
        int num1=myvar.nextInt();
        int num2=myvar.nextInt();
        System.out.println("num1 is : "+ num1);
        System.out.println("num2 is : "+ num2);
        int temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("After Swaping : \n num1 is : "+ num1);
        System.out.println("num2 is : "+ num2);


        
    }
    
}
