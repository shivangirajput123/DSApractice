public class negative {
    static void rearrange(int arr[], int n){
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                if(i != j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }j++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[]={1, 5, 2, -7, 2, -9, -3, -6};
        int n=arr.length;
        rearrange(arr, n);
    }
    
}
