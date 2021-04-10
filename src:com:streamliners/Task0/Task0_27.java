//program to calulate avergae using array
import java.util.Scanner;
public class Task0_27{
    public static void main(String[] args){
        Scanner myvar=new Scanner(System.in);
        System.out.println("enter number of elements in an array");
        int n= myvar.nextInt();
        double[] array = new double[n];
        System.out.println("enter elements in an array ");
        for(int i=0;i<n;i++){
            array[i]=myvar.nextDouble();
        }
        double sum=0.0;
        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        double avg = sum/n;
        System.out.println("average is  "+ avg);
    }

    
}