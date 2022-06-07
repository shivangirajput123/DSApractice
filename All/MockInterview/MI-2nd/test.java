public class test {
    public static void main(String [] args){
        int arr[]={700, 9, 1, 23, 41, 51};
    // int n=arr.length;
        int max=2;
        int min=2;
        for(int i=0; i < arr.length; i++){
            if(max<arr[i]){
                max=arr[i];

            }
        }
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }System.out.println(max);
         System.out.println(min);
                             
                
            
        

    }
    
    
}
