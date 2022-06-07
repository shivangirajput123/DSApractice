public class RepeatingAndMIssing {
    public static void RrMm(int arr[], int n){
        int i=0;
        for(i=0; i<n; i++){
            int abs_val=Math.abs(arr[i]);
            if(arr[abs_val-1]>0){
                arr[abs_val-1]=-arr[abs_val-1];
            }
            else{
                System.out.println(abs_val);
            }
        }
        for(i=0; i<n; i++){
            if(arr[i]>0){
                System.out.println(i+1);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={7, 3, 4, 5, 6, 1, 1};
        int n=arr.length;
        RrMm(arr, n);
    }
    
}
