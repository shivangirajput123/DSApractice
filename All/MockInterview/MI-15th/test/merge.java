
public class merge {
    public static void conquir(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
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
        while(idx2<=ei){
            temp[x++]=arr[idx2++];
        }

        for(int i=0,j=si; i<temp.length; i++,j++){
            arr[j]=temp[i];
        }

    }
    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquir(arr, si, mid, ei);    
    }
    public static void main(String[] args) {
        int arr[]={12, 3, 4, 5, 11, 2, 7};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

// int k=0;
int i=0;
int j=i+1;
if(arr[i]>arr[j] && arr[j]<(n-1)){

}