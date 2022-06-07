public class candy {
    public static int candy(int[] arr) {
        int n = arr.length;
        int []dp = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                dp[i] = 1 + dp[i-1];
            } else{
                dp[i] = 1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(arr[i] > arr[i+1] && dp[i] <= dp[i+1]){
                dp[i] = dp[i+1] + 1;
            }
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += dp[i];
        }
        return sum;
        
    }


    public static void main(String[] args) {
        int arr[]={1, 0, 2};
        int ans=candy(arr);
        System.out.println(ans);
    }
}
        
