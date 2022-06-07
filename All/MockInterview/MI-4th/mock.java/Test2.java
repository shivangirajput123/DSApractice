public class Test2 {
    public static void main(String [] args){
        int arr[]={8,7,6,9,0,5};
        int n=arr.length;
        int max=0;
        
        int ele=0;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
            for(int j=i+1; j<n-1; j++){
                int min=n-i;
                if(arr[j]<=arr[i] && arr[j]>=min){
                    ele=arr[j];

                }
            }                     
                
        }System.out.print(ele + " "); 


    }
    
}
