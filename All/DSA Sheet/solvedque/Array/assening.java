public class assening {
    static void swap(int arr[], int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:{
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2:{
                    int temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }
 
    public static void main(String [] args){
        int arr[]={0, 1, 2, 0, 1, 1, 2, 0, 0};
        int n=arr.length;
        swap(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
}
    