public class MaximumProfit {
        static int maxProfit(int arr[], int n){
        int profit[] = new int[n];
        for (int i = 0; i < n; i++){
            profit[i] = 0;
        }           
        int max_arr = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max_arr){
                max_arr = arr[i];
            }                
            profit[i] = Math.max(profit[i + 1],max_arr - arr[i]);
        }
        int min_arr = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min_arr){
                min_arr = arr[i];                
            }                
            profit[i] = Math.max(profit[i - 1], profit[i] + (arr[i] - min_arr));
        }
        int result = profit[n - 1];
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2, 30, 15, 10, 8, 25, 80};
        int n=arr.length;
        System.out.println(maxProfit(arr, n));
    }
    
}
