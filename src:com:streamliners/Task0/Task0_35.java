public class Task0_35 {

    public static void main(String[] args) {
  
      String str1 = new String("Hello");
      String str2 = new String("Hello");
      System.out.println("Strings are equal or not :")
      // using == operator
      boolean result1 = (str1 == str2);
      System.out.println("Using == operator: " + result1);
  
      // using equals() method
      boolean result2 = str1.equals(str2);
      System.out.println("Using equals(): " + result2);
    }
  }
