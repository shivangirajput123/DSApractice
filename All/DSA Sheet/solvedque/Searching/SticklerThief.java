public class SticklerThief {
    public static int sum(int arr[], int n){
        int max1=arr[0];
        int max2=Math.max(arr[0], arr[1]);
        int sum=0;
        for(int i=2; i<n; i++){
            sum=Math.max(max2, max1+arr[i]);
            max1=max2;
            max2=sum;
        }return max2;
    }
    public static void main(String[] args) {
        int arr[]={5, 5, 10, 100, 10, 5};
        int n=6;
        for(int i=0; i<n; i++){
            System.out.println(sum(arr, n));
            return;
        }
    }
}
