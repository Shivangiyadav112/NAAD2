import java.util.ArrayList;
import java.util.List;
class Task2_01 {
  public static void main(String[] args) {
    String STR = "2;5;6;7;8;9";
     System.out.println("result = " + getlist(STR));
  }
  public static List<Integer>getlist(String S){
// splitting the string at ";"   
    String [] result=S.split(";");
    List<Integer> intList =new ArrayList<>();
    for(String s : result)
        intList.add(Integer.parseInt(s));
    return intList;
  } 
}
