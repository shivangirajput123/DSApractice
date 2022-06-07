public class copy {
    static int diff(int arr[], int k){
        int n=arr.length;
        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(k == Math.abs(arr[i] - arr[j])){
                    count++;
                    
                   
                }
            } 
        }return count;

    }
    public static void main(String[] args){
        int arr[]={1, 2, 2, 1};
        int k=1;
        System.out.println(diff(arr, k));         

    }
    
}
