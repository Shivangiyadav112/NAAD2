import java.util.Scanner ;
public class Task0_12 {
    public static void main(String[] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter a string");
        String str = myvar.nextLine();
        str=str.replaceAll("\\s","");
        System.out.println("String without spaces : "+ str);

    }
}