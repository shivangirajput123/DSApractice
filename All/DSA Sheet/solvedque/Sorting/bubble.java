
public class bubble {
    public static void main(String [] args){
        int a[]={5, 3, 8, 1, 9, 5};
        int n=a.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }System.out.println();
    }
}
    