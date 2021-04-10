import java.util.Scanner ;
public class Task0_11 {
    public  static void main(String [] args) {
    Scanner myvar = new Scanner(System.in);
    System.out.println("Enter a string ");
    String str = myvar.nextLine();
    System.out.println("enter a charcater to find its frequency ");
    char ch = myvar.next().charAt(0);
    int f=0;
    for(int i=0;i<str.length();i++){
        if(ch==str.charAt(i)){
            f++;
        }
    }
      System.out.println("frequency is "+ f);
    }
    
 }