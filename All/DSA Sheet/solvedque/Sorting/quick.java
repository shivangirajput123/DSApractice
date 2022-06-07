public class quick {
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=(low-1);

        for(int j=low; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }       

        }
        swap(arr, i+1, high);
        return (i+1); 
    }
    static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);    
            quickSort(arr, low, pivot -1);
            quickSort(arr, pivot+1, high);

        }
        
    }
    public static void main(String [] args){
        int arr[]={1, 5, 3, 7, 3, 6};
        int n=arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();

    }
    
}
