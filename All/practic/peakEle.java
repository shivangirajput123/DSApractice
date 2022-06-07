public class peakEle {
    public static int peak(int[] arr){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=si + (ei-si)/2;
            if(si>=arr.length-1){
                return si;
            }
            else if(arr[mid]>arr[mid+1]){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }return si;
    }
    public static void main(String[] args) {
        int arr[]={ 1,2,3,5 }; 
        int n=arr.length;
        for(int i=0; i<arr.length; i++){
            System.out.println(peak(arr));
            return;
        }     
    }
}