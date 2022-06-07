
public class T1 {
    static Node head;
    int size;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
        size++;
    }
    private Node revrse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    private boolean isPalin(Node head){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=revrse(slow);
        fast=head;

        while(slow != null){
            if(fast.data != slow.data){
                return false;
            }
            else{
                fast=fast.next;
                slow=slow.next;
            }
        }
        return true;

    }

    private void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        T1 ll=new T1();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        ll.traverse(head);

        System.out.println("PalindromCheck\n");
        boolean temp=ll.isPalin(head);
        if(temp == true){
            System.out.println("LinkedList is Palindrom");
        }
        else{
            System.out.println("LinkedList is not Palindrom");
        }
        
        
    }
    
}