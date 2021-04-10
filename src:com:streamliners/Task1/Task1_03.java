

public class Task1_03 {

    public static void main(String[] args) {
        boolean res =isDirectlyProportional(new int[] {5,4,3,2}, new int[] {10,8,6,4});
       if(res)
            System.out.println("X and Y are directly proportional ");
        else 
            System.out.println("X and y are not directly prportional");
    }

    private static boolean isDirectlyProportional(int[] x, int[] y) {
        float value = (float)x[0]/y[0]; boolean result=true;
        for(int i=1;i<x.length;i++){
            for(int j=1;j<y.length;j++){
                float value1=(float)x[i]/y[j];
                if(value==value1)
                    result = true;
                else    
                    result = false;
            }
        }

        return result;
    }

}