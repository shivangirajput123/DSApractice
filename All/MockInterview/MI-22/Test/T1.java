import java.util.Stack;

class T1 {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();

    public static void enqueue(int x){

        while(!s1.empty()){
            s2.push(s1.peek());
            s1.pop();
        }

        while(!s2.empty()){
            s1.push(s2.peek());
            s2.pop();
        }

    }

    public static void dequeue(){
        if(s1.empty()){
            return;
        }
        int x=s1.peek();
        s1.pop();
    }
    
}