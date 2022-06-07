import java.util.HashSet;

public class t1 {
    public static void tripleSum(int arr[], int k, int n){
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        int j=n-1;
        for(i=0; i<n; i++){
            set.add(arr[i]);
        }

        for(i=0; i<n; i++){
            int temp=(k-(arr[i]+arr[j]));            
            if(set.contains(temp)){
                System.out.println(arr[i] + " " + arr[j] + " " + temp);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={12, 3, 4, 5, 11, 2, 7};
        int k=20;
        int n=arr.length;
        tripleSum(arr, k, n); 
    }
    
}
