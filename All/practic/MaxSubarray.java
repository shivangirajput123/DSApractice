public class MaxSubarray {
    public static void maxSumm(int arr[], int n){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            curr_sum=curr_sum+arr[i];     

            if(max_sum<curr_sum){
                max_sum=curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        System.err.println(max_sum);
        
    }
    public static void main(String[] args) {
        int arr[]={1, 5, -9, 6, -3, -2, 3, 5};
        int n=arr.length;
        maxSumm(arr, n);
    }    
}
