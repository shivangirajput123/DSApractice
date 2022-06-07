public class merge2 {
    public static void merge(int arr1[], int arr2[], int m, int n){
        int temp[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        //[1,2,2,2,3,3,3,4,5,]
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                temp[k]=arr1[i];
                i++;
            }
            else{
                temp[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            temp[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k]=arr2[j];
            j++;
            k++;
        }
        for(i=0; i<temp.length; i++){
            System.out.print(temp[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,2,3,3,6};
        int m=arr1.length;
        int n=arr2.length;
        merge(arr1, arr2, m, n);
    }
    
}
