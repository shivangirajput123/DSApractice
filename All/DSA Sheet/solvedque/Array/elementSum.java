import java.util.HashMap;

public class elementSum {
    public static class pair {
        static int first, second;
 
        public pair(int first, int sec){
            this.first = first;
            this.second = second;
        }
    }
    public static void ele(int arr[], int n, int X){
        HashMap<Integer, pair> map=new HashMap<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                if(map.containsKey(arr[i] + arr[j])){
                    map.put(arr[i] + arr[j], new pair (i,j));
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                int sum=arr[i]+arr[j];
                if(map.containsKey(X-sum)){
                    pair p =map.get(X-sum);
        
                    if(p.first != i && p.first != j && p.second != i && p.second != j){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[p.first] + " " + arr[p.second]);
                    }
                }        
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={ 10, 20, 30, 40, 1, 2 };
        int n=arr.length;
        int X=91;
        ele(arr, n, X);
        
    }
}