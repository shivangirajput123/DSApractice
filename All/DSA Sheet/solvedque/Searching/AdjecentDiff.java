public class AdjecentDiff {
    public static int find(int arr[], int x, int k){
        int i=0;
        while(i<arr.length){
            if(arr[i] == x){
                return i;
            }
            i=i + Math.max(1, Math.abs(arr[i]-x)/k);
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        System.out.println(find(arr, x, k));
    }
    
}
