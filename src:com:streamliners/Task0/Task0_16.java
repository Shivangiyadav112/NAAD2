import java.util.Scanner;

public class Task0_16 {
    public static void main(String[] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter a number to be converted into string");
        int num= myvar.nextInt();
        String str= String.valueOf(num);
        System.out.println("number in String : "+ str);
    }
    
}