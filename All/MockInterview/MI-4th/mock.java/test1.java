public class test1 {
    public static void main(String[] args){
        int arr[]={3, 6, 8, 5, 9, 24, 6};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
    
}
