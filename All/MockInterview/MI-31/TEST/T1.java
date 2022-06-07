public class T1{
    public static void putZeroAtEnd(int arr[], int n){
        int count=0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 8, 0, 2, 0, 1, 13, 0};
        int n=arr.length;
        putZeroAtEnd(arr, n);
    }

}