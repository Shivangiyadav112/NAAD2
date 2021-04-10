//WAP to find the largest number among three numbers
import java.util.Scanner;
public class Task0_9{
    public static void main(String [] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1= myvar.nextInt();
        int num2 = myvar.nextInt();
        int num3= myvar.nextInt();
        if(num1>=num2 && num1>=num3)
            System.out.println( "largest number is : "+ num1);
        else if(num2>=num1 && num2>=num3)
            System.out.println("largest number is : "+ num2);
        else  
            System.out.println("largest number is : "+ num3);   
    }
}