import java.util.Scanner;

public class Task0_7 {
    public static void main(String[] args) {
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter a number ");
        int num=myvar.nextInt();
        if(num%2==0)
            System.out.println("number is even ");
        else
            System.out.println("number is odd");
        
    }
    
}

