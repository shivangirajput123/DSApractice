import java.util.HashSet;

public class test3 {
    public static void equal(int arr[], int k){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int temp=k-arr[i];
            if(set.contains(temp)){
                System.out.println(arr[i] + " " + temp);
                return;
            }
            set.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,5,3,6};
        int k=9;
        equal(arr, k);
        
    }
    
}
