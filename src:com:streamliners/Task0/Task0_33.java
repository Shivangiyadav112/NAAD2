import java.util.Scanner;
public class Task0_33 {
    public static void main(String[] args) {
        Scanner myvar=new Scanner(System.in);
        System.out.println("Enter a string");
      String str = myvar.nextLine();
      
      char[] charArray = str.toCharArray();
      boolean Space = true;
  
      for(int i = 0; i < charArray.length; i++) {
  
        // if the array element is a letter
        if(Character.isLetter(charArray[i])) {
  
          // check space is present before the letter
          if(Space) {
  
            
            charArray[i] = Character.toUpperCase(charArray[i]);
            Space = false;
          }
        }
  
        else {
          // if the next character is not character
          Space = true;
        }
      }
  
      // convert the char array to the string
     str = String.valueOf(charArray);
      System.out.println("updated string: " + str);
    }
  }
  
