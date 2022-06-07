public class t1 {
    public static int binarySearch(int arr[], int start, int end, int x){
        if(start>end){
            return 0;
        }
        int lastindex=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(x<arr[mid]){
                end=mid-1;                
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                lastindex=mid;
                start=mid+1;
                
               
            }
        }return lastindex;
    }
    public static void reverse(int arr[], int start, int end){
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
        start++;
        end--;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,6,6,7,8};
        int x=6;
        for(int i=0; i<arr.length; i++){
            System.out.println(binarySearch(arr, 0, arr.length-1, x));
            return;
        }
        
    }
    
}
