import java.util.Scanner;


public class Task0_30 {
    public static void main(String [] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("Enter a string ");
        String string = myvar.nextLine();
        boolean numeric = true;
        
        numeric = string.matches("-?\\d+(\\.\\d+)?");
        
        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
         
        
    
    
    }
}