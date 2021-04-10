import java.util.Scanner;
public class Task0_18 {
    public static void main(String[] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = myvar.nextInt();
        int t1=0;
        int t2=1;
        System.out.println("fibonacci series upto "+ n+" terms ");
        for(int i=0;i<n;i++){
            System.out.print(t1+" ");
            int sum= t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}
