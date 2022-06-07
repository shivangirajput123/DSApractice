import java.util.Stack;

public class nextGreaterElement {
    public static void nge(int arr[]){
        Stack<Integer> st= new Stack<>();      
        int[] array=new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            if(!st.isEmpty()){
                while(!st.isEmpty() && st.peek()<arr[i]){
                    st.pop();
                }

            }
            array[i]=st.empty()?-1:st.peek();
            st.push(arr[i]);            
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(array[i]);
        }

        
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 1};
        nge(arr);
        
    }
    
}
