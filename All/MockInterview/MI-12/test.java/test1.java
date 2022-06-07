public class test1 {
    public static void subProd(int arr[], int n){
        int maxPro=Integer.MIN_VALUE;        
        for(int i=0; i<n; i++){
            int currPro=1;
            for(int j=i; j<n; j++){
                currPro*=arr[j];
                maxPro=Math.max(currPro, maxPro);
            }
            
        }System.out.println(maxPro);
    }
    public static void main(String[] args) {
        int arr[]={6, -3, -10, 0, 2};
        int n=arr.length;
        subProd(arr, n);
        
    }
    
}
