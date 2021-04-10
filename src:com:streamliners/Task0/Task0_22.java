//program to check whether a number is palindrome or not
import java.util.Scanner;

public class Task0_22 {
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
       if(num==reverse)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");

       
    }    
}

