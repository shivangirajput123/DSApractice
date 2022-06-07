public class findKMergedSort {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int merged[]=new int[m+n];
        int i=0;
        int j=0;
        int x=0;
        while(i<n && j<m){
            if(arr1[i]>arr2[j]){
                merged[x]=arr2[j];
                j++;
            }else{
                merged[x]=arr1[i];
                i++;
            }
            x++;
        }
        while(i<n){
            merged[x]=arr1[i];
            i++;
            x++;
        }
        while(j<m){
            merged[x]=arr2[j];
            j++;
            x++;
        }return merged[k-1];
        
    }
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int n=arr1.length;
        int m=arr2.length;
        int k = 5;
        System.out.println(kthElement(arr1, arr2, n, m, k));
    
    }
}