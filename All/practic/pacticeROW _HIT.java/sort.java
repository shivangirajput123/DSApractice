public class sort {
    static Node head;
    int size;
    public class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    private Node sortMerge(Node a, Node b){
        Node result=null;
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        if(a.data < b.data){
            result=a;
            result.next=sortMerge(a.next, b);
        }
        else{
            result=b;
            result.next=sortMerge(a, b.next);
        }
        return result;
    }

    private Node mergeSort(Node head){
        if(head == null){
            return null;
        }        
        Node middle=middle(head);
        Node nextOfMiddle=middle.next;
        middle.next = null;

        Node left=head;
        Node right=nextOfMiddle;
        
        Node sortListed=sortMerge(left, right);

        return sortListed;
    }

    private Node middle(Node head){
        if(head == null){
            return null;
        }
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    private void insert(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
        size++;
    }

    private void traverse(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        sort ll=new sort();
        ll.insert(2);
        ll.insert(3);
        ll.insert(1);
        ll.insert(0);
        ll.traverse(head);
        System.out.println("sorted\n");
        ll.mergeSort(head);
        ll.traverse(head);


    }
    
}
