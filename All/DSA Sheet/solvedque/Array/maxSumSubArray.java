public class maxSumSubArray {
    static int max(int arr[], int n){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            currSum=currSum + arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }return maxSum;
    }
    public static void main(String [] args){
        int arr[]={1, 5, -9, 6, -3, -2, 3, 5};
        int n=arr.length;
        System.out.println(max(arr, n));
    }
}