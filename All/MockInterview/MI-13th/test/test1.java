import java.util.HashMap;

public class test1 {

    public static void nonRepeatingELement(int arr[], int n){
        HashMap<Integer, Integer> a=new HashMap<>();

        for(int i=0; i<n; i++){
            a.put(arr[i], 0);
        }
        int val=0;
        for(int i=1; i<n-1; i++){
            if(!a.containsKey(arr[i])){
                val=a.get(arr[i]);
            }
        }System.out.println(val);

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 1, 2, 4, 3};
        int n=arr.length;
        nonRepeatingELement(arr, n);
    }
}
