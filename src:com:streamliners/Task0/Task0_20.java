//program to count n umber of digits in a integer
import java.util.Scanner; 
public class Task0_20{
    public static void main(String[] args){
        Scanner myvar = new Scanner(System.in);
        System.out .println("enter an integer number : ");
        int num = myvar.nextInt();
        int n=num;
        int count=0;
        while(n>0){

            n=n/10;
            
            count++;
        }
        System.out.println("number of digits in a number : "+ count);
    }
}