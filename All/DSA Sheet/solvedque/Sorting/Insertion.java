

public class Insertion{
    public static void main(String [] args){
        int a[]={7, 4, 9, 2, 6, 34, 8, 9};
        int n=a.length;
        for(int i=1; i<n; i++){
            int key=a[i];
            int j=i-1;

            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }a[j+1]=key;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }System.out.println();
    }
       
}

       