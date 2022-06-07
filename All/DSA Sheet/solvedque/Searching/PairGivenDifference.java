import java.util.HashMap;

public class PairGivenDifference {
    public static boolean diff(int arr[], int n){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],true);
        }
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]-n) && arr[i] != n){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int arr[]={5, 20, 3, 2, 5, 80};
        int n=78;
        for(int i=0; i<arr.length; i++){
            System.out.println(diff(arr, n));
            return;
        }
    }
    
}
