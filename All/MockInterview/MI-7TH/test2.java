// import java.util.HashMap;
// import java.util.Map;

public class test2 {

    public static void nonRepeatingElement(int arr[], int n){
    //     Map<Integer, Integer> x=new HashMap<>();
        
    //     for(int i=0; i<n; i++){
    //         if(x.containsKey(arr[i])){
    //             x.put(arr[i], x.get(arr[i])+1);
    //         }else
    //             x.put(arr[i], 1);
            
    //     }
    //     for(int i=0; i<n; i++){
    //         if(x.get(arr[i]) > 1)
    //         System.out.print(arr[i] + " ");
    //     }

       
         
    // }


        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){                
                if(arr[i] == arr[j]){
                    count++;
                }
            }if(count == 1){
                System.out.print(arr[i] + " ");
            }
        }
       
    }
    
}
