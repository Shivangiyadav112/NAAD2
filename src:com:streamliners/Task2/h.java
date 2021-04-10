import java.util.*;

public class Task2_03 {

    public static void main(String[] args) {
      
        startGame("SHAMBHO");
    }

    private static void startGame(String s) {
        //Write your code here!
        Scanner myvar=new Scanner(System.in);
        int count=0;
        char [] ch1= s.toCharArray();
        char [] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
          if(ch[i] != 'A'&& ch[i] != 'E' && ch[i] != 'I' && ch[i]!= 'O'&& ch[i]!= 'U'){
            count++;
            ch[i]= '_';

          }
          
        }
        for(int j =0;j<s.length();j++)
          System.out.print(ch[j]);
       
          String guess;
          
        int chances= count+3;
        
        System.out.print("\n Word ");
       
        for(int k=0;k<s.length();k++)
              System.out.print(ch1[k]);
              
              while(chances--!=0){
                  System.out.println("guess :");
                  guess = myvar.next().toUpperCase();
                  char g =guess.toCharArray()[0];
                  for(int k=0;k<s.length();k++){
                    if(g==ch1[k]){
                       
                      ch[k]=g;
                      for(int l=0;l<s.length();l++)
                        System.out.print(ch[l]);

                    }
                   
                  }
                  if(ch.toString().equals(ch1.toString())){
                   break;

                  }
                 

                    
                  
                 
                }
               
        }


       
    

}
