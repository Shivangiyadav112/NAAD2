//program to make a simple calculator using switch case
import java.util.Scanner;
public class Task0_23{
    public static void main(String[] main){
        Scanner myvar=new Scanner(System.in);
        System.out.println("enter two number");
        float num1= myvar.nextFloat();
        float num2 = myvar.nextFloat();
        System.out.println("Which operation you want to perform \n 1. addition \n 2.Subtraction \n 3.multiplication \n 4. division");
        int choice = myvar.nextInt();
        float result=0.0f;
        switch (choice) {
            case 1 :result=num1+num2;
                        System.out.println("Addition is : " + result);
                        break;
            case 2 : result=num1-num2;
                        System.out.println("Subtraction  is : " + result);
                        break;
            case 3 : result=num1*num2;
                        System.out.println("multiplication is : " + result);
                        break;
            case 4 : result= (num1/num2);
                        System.out.println("Division is : " + result);
                        break;
            default : System.out.println("WRONG CHOICE");
        }

    }
}
