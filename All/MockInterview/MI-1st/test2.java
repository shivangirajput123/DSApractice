// int arr[] = {-1, -1, 3, 45, 67};
// int k = 34;
public class test2 {
    public static void main(String [] args){
        int arr[]={10, 22, 3, 45, 67};
        int n=arr.length;
        

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]<arr[j+18]){
                    int temp=arr[j];
                    arr[j]=arr[j]+1;
                    arr[j+1]=temp;

                    
                    
                }
            }       

            
            
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

       
    }

    
}
