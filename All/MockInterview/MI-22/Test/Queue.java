import java.security.Key;

class QNode{
    QNode next;
    static int key;

    QNode(int key){
        this.key=key;        
    }    
}
public class Queue{   
    
    static QNode front;
    static QNode rear;
    Queue(){
        this.front=this.rear=null;
    }

    public void enqueue(int key){
        QNode temp=new QNode(key);

        if(this.front == null){
            return;
        }
        this.rear.next=temp;
        this.rear=this.rear.next;       
        
    }

    public void dequeue(){
        if(this.front == null){
            return;
        }
        QNode temp=this.front;
        this.front=this.front.next;        

        if(this.front == null){
            this.rear=null;
        }
    }

    
    public static void main(String[] args) {
        Queue ll=new Queue();
        ll.enqueue(1);
        ll.enqueue(2);
        ll.enqueue(8);
        ll.enqueue(10);
        System.out.println(front.key + " ");
        ll.dequeue();
        System.out.println(rear.key + " ");
       
        
        
    }
    
}
