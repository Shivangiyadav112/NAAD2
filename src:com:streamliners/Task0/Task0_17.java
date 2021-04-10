import java.util.Scanner;

public class Task0_17 {
    public static void main(String [] args){
        Scanner myvar= new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = myvar.next().charAt(0);
        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
            System.out.println("Entered character is an alphabet");
        else
            System.out.println("Entered character is not an alphabet");
    }
    
}
