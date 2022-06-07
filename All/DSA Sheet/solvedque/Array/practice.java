public class practice {
    public static void rev(int arr[], int n){
      int low=0;
      int high=n-1;
      int mid=0;
      while(mid<high){
          switch(arr[mid]){
              case 0:{
                  int temp=arr[low];
                  arr[low]=arr[mid];
                  arr[mid]=temp;
                  low++;
                  mid++;
                  break;
              }
              case 1:{
                  mid++;
                  break;
              }
              case 2:{
                  int temp=arr[mid];
                  arr[mid]=arr[high];
                  arr[high]=temp;
                  high--;
                  break;
              }
          }
         
      }
    }
    public static void main(String[] args) {
        int arr[]={1, 0, 2, 1, 1};
        int n=arr.length;
        rev(arr, n);
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
      
    }
    
}
