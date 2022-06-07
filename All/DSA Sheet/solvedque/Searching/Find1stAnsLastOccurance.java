public class Find1stAnsLastOccurance{
    public static int first(int arr[], int n, int x){
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }return res;
    }

    public static int Last(int arr[], int n, int x){
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                res=mid;
                low=mid+1;
            }
        }return res;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 5, 5, 5, 5, 67, 123, 125 };
        int n=arr.length;
        int x=5;
        for(int i=0; i<n; i++){
            System.out.println(first(arr, n, x) + " " + Last(arr, n, x));
            return;
        }
    }
    
}
