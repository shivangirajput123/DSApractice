public class palinArray {
    public static int palinarray(int a[], int n) {
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=reverse(a[i]);
            if(a[i] != arr[i]){
                return 0;
            }
        }return 1;
        
    }
    public static int reverse(int n){
        int rev=0;
        while(n != 0){
            rev=n*10 + n%10;
            rev=n/10;
        }return rev;
    }
    public static void main(String[] args) {
        int a[]={111, 221, 333, 444, 555};
        int n=5;

        for(int i=0; i<n; i++){
            System.out.println(palinarray(a, n));
            return;
        }           
    }
}
