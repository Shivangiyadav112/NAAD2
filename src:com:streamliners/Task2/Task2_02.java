
import java.util.*;
public class Task2_02 {

    public static void main(String[] args) {
        System.out.println(getOccurrencesHashMap("1;2;2;2;3;1"));
    }

    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        //Write your code here!
        String []str = s.split(";");
        List<Integer>intList= new ArrayList<>();
        for(String S : str){
            intList.add(Integer.parseInt(S));
        }

        HashMap<Integer,Integer>H1= new HashMap<>();
        Set<Integer>integerSet = new HashSet<>(intList);
        for(int i : integerSet)
          H1.put(i,Collections.frequency(intList,i));

        return H1 ;
    }

}

