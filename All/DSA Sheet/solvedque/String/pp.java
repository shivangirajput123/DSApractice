public class pp {
    static Node head;
    Node tail;
    int size;
    public class Node{
        Node next;
        int data;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    private void inserst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    private void travers(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public static void main(String[] args) {
        pp ll=new pp();
        ll.inserst(5);
        ll.inserst(4);
        ll.inserst(3);
        ll.inserst(2);
        ll.travers(head);
        
    }
}