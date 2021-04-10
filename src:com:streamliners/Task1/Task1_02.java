

public class Task1_02 {

    public static void main(String[] args) {
        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }

    private static int totalWeight(String s, int[] weights) {
     char [] ch=s.toCharArray();
     int A = 0,B=0,C=0,D=0,E=0;
     for(int i=0;i<s.length();i++){
         switch(ch[i]){
            case 'A' : A++;
                        break;
            case 'B' : B++;
                        break;
            case 'C' : C++;
                        break;
            case 'D' : D++;
                        break;
            case 'E' : E++;
                        break;
            default:  
         }
        
        }

        return(A*weights[0]+B*weights[1]+C*weights[2]+D*weights[3]+E*weights[4]);
    }

}