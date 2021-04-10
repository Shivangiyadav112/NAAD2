//program to count the number of consonents and vowels in a sentence
import java.util.Scanner;
public class Task0_24{
    public static void main(String[] args){
        Scanner myvar = new Scanner(System.in);
        System.out.println("enter a string :");
        String str = myvar.nextLine();
        int vowels =0 , consonants =0 ;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'|| ch=='A'||ch=='E'|| ch=='I'|| ch=='O'||ch=='U')
                ++vowels;
            else if((ch>='a'&& ch<='z')||(ch>='A'&&ch>='Z'))
                ++consonants;
        }
        System.out.println("Number of vowels : "+ vowels);
        System.out.println("Number of consonants : "+ consonants);



    } 

}
