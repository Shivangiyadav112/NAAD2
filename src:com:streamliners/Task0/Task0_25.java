//program to sort string in lexicographical order
import java.util.Scanner;
public class Task0_25 {

    public static void main(String[] args) 
    {
     
        String temp;
        Scanner myvar = new Scanner(System.in);
        System.out.print("Enter number of strings you  will enter:");
        int count = myvar.nextInt();
        String str[] = new String[count];
        Scanner myvar2=new Scanner(System.in);
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i <count; i++)
        {
            str[i] = myvar2.nextLine();
        }
       //Sorting the strings
        for (int i = 0; i <count; i++) 
        {
            for (int j = i + 1; j <count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
         //Displaying the strings after sorting 
        System.out.print("String after sorting ");
        for (int i = 0; i <=count-1 ; i++) 
        {
            System.out.print(str[i] + ", ");
        }
       
    }
}
