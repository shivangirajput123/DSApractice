

public class T2 {
    public static int occuranceCount(int arr[], int left, int right, int target){
        int n=arr.length;
        int count=0;
        if(left>right){
            return 0;
        }

        while(left<right){
            int mid=left + (right-left)/2;

            if(target == arr[mid]){
                return count++;
                
            }
            else if(target<arr[mid]){
                return mid - 1;
            }
            else {
                return mid + 1;
            }          
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int n=arr.length;
        int target=2;
        System.out.println(occuranceCount(arr, 0, n-1, target));
    }
    
}
