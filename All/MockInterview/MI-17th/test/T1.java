
public class T1 {
    static int stack[] = new int[100];
    static int top=-1;

    private static void push(int x){
        if(top == 100){
            System.out.println("Stack is full");
           
        }
        else{
            stack[++top]=x;
        }
        
    }
    private static void pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
        }

    }
    private static void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    private static int size(){
        return top+1;       

    }
    
    public static void main(String[] args) {
        push(5);
        push(2);
        push(5);

        
    }

    
}