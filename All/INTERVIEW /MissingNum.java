public class MissingNum {
    static int miss(int arr[], int N){
        int act=N*((N+1)/2);
        int sum=0;
        for(int i:arr){
            sum+=i;
        }return (act-sum);
    }
    public static void main(String [] args){
        int arr[]={1,2,3,5};
        System.out.println(miss(arr, 5));

    }  
}
