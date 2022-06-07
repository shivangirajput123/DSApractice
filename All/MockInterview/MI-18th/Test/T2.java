import java.util.HashSet;

public class T2 {
    public static void findPair(int arr[], int n, int k){
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0; i<n; i++){
            set1.add(arr[i]);
        }
        for(int i=0; i<n; i++){
            int temp=k-arr[i];
            if(set1.contains(temp)){
                System.out.println(arr[i] + " " + temp);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6};
        int n=arr.length;
        int k=7;
        findPair(arr, n, k);
    }
    
}
