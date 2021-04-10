import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Task0_28 {
    public static void main (String [] args){
        System.out.println("enter date in yyyy-mm-d format ");
        Scanner myvar=new Scanner(System.in);
        String str = myvar.nextLine();
        LocalDate date = LocalDate.parse(str,DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
    
}

