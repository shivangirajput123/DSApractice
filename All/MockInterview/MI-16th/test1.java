

public class test1{
    public static void conquir(int arr[], int start, int mid, int end){
        int temp[]=new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=end){
            if(arr[idx1]<=arr[idx2]){
                temp[x++]=arr[idx1++];
            }
            else{
                temp[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            temp[x++]=arr[idx1++];
        }
        while(idx2<=end){
            temp[x++]=arr[idx2++];
        }
        for(int i=0,j=start; i<temp.length; i++,j++){
            arr[j]=temp[i];
        }

    }
    public static void divide(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        else{
            int mid=start+(end-start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            conquir(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,4,6,1,0,5,3};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}