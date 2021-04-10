import java.util.Scanner;

public class Task0_14 {
    public static void main(String[] args){
        Scanner myvar= new Scanner(System.in);
        String str= myvar.nextLine();
        if(str==null|| str.isEmpty()){
            System.out.println("string is empty or null");
        }
        else 
            System.out.println("string is not empty or null");
    }
    
}
