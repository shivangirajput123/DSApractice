public class t2 {
    public static void majority(int arr[], int n){
        int maxCOunt=0;
        int index=-1;
        for(int i=0; i<n; i++){  
            int count=0;          
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(maxCOunt<count){
                maxCOunt=count;
                index=i;
            }
        }       

        if(maxCOunt>n/2){
            System.out.println(arr[index]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;
        majority(arr, n);
        
    }
    
}
