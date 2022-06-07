public class Rearrange {
    public static void rearrange(int arr[], int n){
        int i=0, j=n-1;
        while(i<j){
            while(i<=n-1 && arr[i]>0){
                i++;
            }
            while(j>=0 && arr[i]<0){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
        if(i == 0 || i == n){
            return;
        }
        int k=0;
        while(k<n && i<n){
            swap(arr, k, i);
            i=i+1;
            k=k+2;
        }
        for(i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, -4, -1, 4};
        int n=arr.length;
        rearrange(arr, n);      
    }
    
}
