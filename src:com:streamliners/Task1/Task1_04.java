import java.util.Scanner;

class  InvalidReplcamentException extends Exception{
    public InvalidReplcamentException(String s){
        super(s);
        System.out.println(s);
    }
}
public class Task1_04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.next();
        System.out.println("Enter the replacement string");
        String rep = sc.next();
        char ch[]= s.toCharArray();
        char ch1[]= rep.toCharArray(); 
        boolean bool=true;
        for(int i=0;i<rep.length();i=i+2){
            for(int j=0;j<s.length();j++){
                if(ch1[i]==ch[j]){
                    bool=true;
                }
                bool= false;
            }

        }
        String reg = "([0-9][A-Z])*$";
        if (rep.matches(reg)&&bool){
            System.out.println("valid string");
        }
        else {
            try{
                throw  new InvalidReplcamentException(rep);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}