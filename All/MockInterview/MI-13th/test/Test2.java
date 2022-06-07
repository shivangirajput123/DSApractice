public class Test2 {
    public static int seach(int arr[], int n, int l, int h, int key){
        if(l>h){
            return -1;
        }
        int mid=(l+h)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[l]<=arr[mid]){
            if(key>=arr[l] && key<=arr[mid]){
                return seach(arr, n, 0, mid-1, key);
            }
            else{
                return seach(arr, n, mid+1, h, key);
            }
        }
        if(arr[mid]<=arr[h]){
            if(key<=arr[h] && key>=arr[mid]){
                return seach(arr, n, mid+1, h, key);
            }
        }return seach(arr, n, 0, mid-1, key);
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3,4};
        int n=arr.length;
        int key=2;
        int i=seach(arr, n, 0, n-1, key);
        
        if(i != -1){
            System.out.println(i + " ");
        }else{
            System.out.println("not found");
        }

    }
    
}
