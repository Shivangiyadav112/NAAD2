//program to reverse a number
import java.util.Scanner;

public class Task0_21 {
    public static void main(String[] args){
        Scanner myvar=new Scanner(System.in);
        System.out.println("enter a number");
        int num = myvar.nextInt();
        int n=num;
        int digit, reverse=0;
        while(n!=0){
            digit=n%10;
            reverse=(reverse*10)+digit;
            n=n/10;
        }
        System.out.println("reverse of a number is : "+ reverse);
       
    }    
}
