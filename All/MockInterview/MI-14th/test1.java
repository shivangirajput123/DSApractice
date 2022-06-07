import java.util.HashSet;

public class test1 {
    public static boolean subset(int arr1[], int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            if(!set.contains(arr2[j])){
                return false;
            }                
                       
        }return true;
        // int set1=0;
        // int set2=0;
        // int count=1;
        


    //     int j=0;
    //     for(int i=0; i<arr1.length; i++){
    //         for(j=0; j<arr2.length; j++){
    //             if(arr1[i] == arr2[j]){
    //                 break;
                    
    //             }
            
    //         }
    //     }if(j == arr2.length){
    //         return false;
    //     }
    //     return true;
        

    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={1,3,6};
      
        for(int i=0; i<arr1.length; i++){
            System.out.println(subset(arr1, arr2));
            return;
        }
    }
    
}
