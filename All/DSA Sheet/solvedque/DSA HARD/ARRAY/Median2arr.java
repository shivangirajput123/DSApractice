public class Median2arr {
    public static int merged(int arr1[], int arr2[], int n, int m){
        int m1=-1,m2=-1;
        int i=0;
        int j=0;
        int count;
        if((m+n)%2 == 1){
            for(count=0; count<=(n+m)/2; count++){
                if(i != n && j !=m){
                    m1=((arr1[i]>=arr2[j]) ? arr2[j++] : arr1[i++]);
                }
                else if(i<n){
                    m1=arr1[i++];
                }
                else{
                    m1=arr2[j++];
                }
            }return m1;
        }
        else{
            
            for(count=0; count<=(n+m)/2; count++){
                m1 = m2;
                if(i != n && j !=m){
                    m1=((arr1[i]>arr2[j]) ? arr2[j++] : arr1[i++]);
                }
                else if(i<n){
                    m1=arr1[i++];
                }
                else{
                    m1=arr2[j++];
                }
            }return (m1+m2)/2;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {-5, 3, 6, 12, 15};
        int arr2[] = {-12, -10, -6, -3, 4, 10};
        int n1=arr1.length;
        int n2=arr2.length;
        System.out.println(merged(arr1, arr2, n1, n2));
    }
    
}
