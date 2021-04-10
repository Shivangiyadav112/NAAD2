import java.util.Scanner;

public class Task0_15 {
    public static void main(String[] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter a numeric string");
        String str= myvar.nextLine();
        int result= Integer.valueOf(str);
        System.out.println(result);
    }
    
}
