public class Task1_01{
    public static void main (String [] args){
        String res = modify("12332321","2R3S1T4D");
        System.out.println("After Replacement : "+ res);

    }
    public static String modify(String s , String replacements ){
        char ch[]= s.toCharArray();
        char ch1[]= replacements.toCharArray();
        for(int i=0;i<replacements.length();i=i+2){
            for(int j=0;j<s.length();j++){
                if(ch1[i]==ch[j]){
                    ch[j]=ch1[i+1];
                }
            }
        }

        String str = String.valueOf(ch);
        return str;
    }
}