public class main {
    public static void conquir(int arr[], int low, int mid, int high){
        int merged[]=new int[high-low+1];
        int idx1=low;
        int idx2=mid+1;
        int x=0;
        
        while(idx1<=mid && idx2<=high){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];                
                idx1++;
            }
            else{
                merged[x]=arr[idx2];
                idx2++;
            }
            x++;
        }
        while(idx1<=mid){
            merged[x]=arr[idx1];
            idx1++;
            x++;
        }
        while(idx2<=high){
            merged[x]=arr[idx2];
            idx2++;
            x++;

        }
        int i,j;
        for(i=0,j=low; j<merged.length; i++, j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int mid=low + (high-low)/2;//1//0
        divide(arr, low, mid);//0,1
        divide(arr, mid+1, high);//1,2
        conquir(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int arr[]={2,1,3};
        int n=arr.length;
        
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        
    }

    


    
}