//program to check an aplhabet is vowel or not
import java.util.Scanner;
public class Task0_8 {
    public static void main(String[] args){
        System.out.println("enter an alphabet");
        Scanner myvar = new Scanner(System.in);
        char ch = myvar.next().charAt(0);
        switch(ch){
            case 'a' : 
            case 'e' :   
            case 'i' : 
            case 'o' :    
            case 'u' : 
            case 'A' :    
            case 'E' : 
            case 'I' :   
            case 'O' : 
            case 'U' : System.out.println("Vowel"); 
                        break;
            default : System.out.println("consonent");                                                  
         }

    }
}

