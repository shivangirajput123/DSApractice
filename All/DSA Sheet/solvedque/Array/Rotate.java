public class Rotate {
    static void rotate(int arr[], int n){
        for(int i=0; i<n; i++){
            int index=n-1;
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4, 5};
        int n=arr.length;
        rotate(arr, n);
    }
}
