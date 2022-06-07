public class tes1 {
    public static void FirstOccurance(int arr[], int n, int k){
        int first=0;
        int i=0;
        for(i=0; i<n; i++){
            if(arr[i] == k){
                first=arr[i];
                break;               
            }
        }System.out.println(i + " ");
    }



    public static void main(String[] args) {
        int arr[]={5, 7, 7, 8, 8, 10};
        int n=arr.length;
        int k=8;
        FirstOccurance(arr, n, k);

    }
    
}
