public class subaray {
    // public static int subarray(int arr[], int n, int sum){
    //     int start=0;
    //     int curr_sum=arr[0];
    //     int i=0;
    //     for(i=1; i<=n; i++){
    //         while(curr_sum>sum && start<i-1){
    //             curr_sum=curr_sum-arr[start];
    //             start++;
    //         }
        
    //         if(curr_sum == sum){
    //             int p=i-1;
    //             System.out.println(start + "-" + p);
    //             return 1;
    //         }
            
        
    //     if(i<n)
    //     curr_sum = curr_sum + arr[i];
    // }
    //     System.out.println("no found");
    //     return 0;

    // }
    public static void main(String[] args) {
        int arr[]={ 15, 2, 4, 8, 9, 5, 10, 23 };
        int n=arr.length;
        int sum=33;
        System.out.println(subarray(arr, n, sum));
    }
    public static int subarray(int arr[], int n, int sum){
        int curr_sum=arr[0];
        int start=0;
        int i=0;
        for(i=1; i<=n; i++){
            while(curr_sum>sum && start<i-1){
                curr_sum=curr_sum-arr[start];
                start++;
            }
            if(curr_sum == sum){
                int p=i-1;
                System.out.println(start + " " + p);
                return 1;
            }
        if(i<n){
            curr_sum=curr_sum+arr[i];
            
        }
       
    }
    System.out.println("m");
    return 0;
    
}
}
