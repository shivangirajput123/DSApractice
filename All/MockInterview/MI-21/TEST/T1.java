public class T1 {
    static Node head;
    static Node tail;
    int size;
    public class Node{
        Node next;
        Node prev;
        int data;

        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }
    private void insert(int data){
        Node new_Node=new Node(data);
        if(head == null){
            head=tail;
        }
        new_Node.next=head;
        head=new_Node;

        size++;

    }
    private Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr.next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        return prev;
    }
    private void traverse(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        T1 ll=new T1();
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
        ll.reverse(head);
        ll.traverse(head);
       

        
    }
    
}