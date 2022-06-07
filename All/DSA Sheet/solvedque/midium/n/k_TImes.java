import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class k_TImes {
    public static void moreThanK(int a[], int n, int k){
        int x=n/k;
        HashMap<Integer, Integer> y=new HashMap<>();

        for(int i=0; i<n; i++){
            if(!y.containsKey(a[i])){
                y.put(a[i], 1);
            }
            else{
                int count=y.get(a[i]);
                y.put(a[i], count+1);
            }
        }
        for(Map.Entry m : y.entrySet()){
            Integer temp=(Integer)m.getValue();
            if(temp>x){
                System.out.print(m.getKey() + " ");
            }
        }
    }
    public static void main(String [] args) {
        int a[]={ 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
        int n = 12;
        int k = 4;
        moreThanK(a, n, k);
                
    }
    
}
