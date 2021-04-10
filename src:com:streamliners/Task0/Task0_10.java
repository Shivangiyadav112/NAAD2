import java.util.Scanner;

public class Task0_10 {
    public static void main(String[] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter value of a,b and c");
        float a = myvar.nextFloat();
        float b = myvar.nextFloat();
        float c = myvar.nextFloat();
        float root1 , root2 , det , real , imag;
        det=b*b-4*a*c;
        if(det==0) {
                System.out.println("Roots are real and equal ");
                root1=-b/(2*a);
                System.out.println(" Root 1 = root 2 = "+ root1);
        }       
        else if(det>0)  {
                System.out.println("Roots are real and different ");
                root1=(float)(-b+Math.sqrt(det)/(2*a));
                root2=(float)(-b-Math.sqrt(det)/(2*a));
                System.out.println("Root 1 = "+ root1);
                System.out.println("Root 2 = "+ root2);
        }
                        
        else { 
                System.out.println("Roots are complex and different ");
                real=-b/(2*a);
                imag=(float)Math.sqrt(-det)/(2*a);
                System.out.println("Root 1 = "+ real + "+ "+ imag +"i");
                System.out.println("Root 2 = "+ real + "- "+ imag +"i");
         }
    }
    
}
