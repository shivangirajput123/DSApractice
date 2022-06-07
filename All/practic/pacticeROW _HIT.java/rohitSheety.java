import java.security.cert.LDAPCertStoreParameters;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class rohitSheety {
         
        

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int k=3;

        Stack<Integer> st=new Stack<>();
        // 1 2 3 4 5 
        // 3 2 1 4 5

        while(k>0){
            st.push(q.remove());
            k--;
        }
        // 4 5 3 2 1
  
    }    
}
