import java.util.Arrays;

public class kthSmalles {
    static int smallest(int arr[], int l, int r, int k){
        while(l<r){
            if(arr[l]>arr[r]){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }          
        }
        int num=arr[k-1];
        return num;       
        
    }
    public static void main(String[] args){
        int arr[]={6, 5, 8, 2, 0, 4};
        int n=arr.length;
        int k=3;
        for(int i=0; i<n; i++){
            System.out.println(smallest(arr, 0, n-1, k));
            return;
        }
    }
}