import java.util.Arrays;
import java.util.Comparator;
public class decendingOrder {
    public static int[] sortBySetBitCount(int[] arr, int n){
        Arrays.sort(arr, new Comparator<Integer>(){

            public int compare(Integer arg0, Integer arg1){
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                if (c1 <= c2)
                    return 1;
                else
                    return -1;
            }
        });
        return arr;
    }
    public static void main(String[] args){
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = 6;

        for(int i=0; i<n; i++){
            System.out.println(sortBySetBitCount(arr, n));
        }
    }
 
}
    

