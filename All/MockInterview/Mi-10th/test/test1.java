
public class test1 {
    public Node reverse(Node node){
        Node prev=null;
        Node curr=node;
        Node next=null;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;

    }
    public boolean palindrome(Node head){
        Node revHead = reverse(head);

        while(head != null){
            if(revHead.data != head.data){
                return false;
            }
            revHead=revHead.next;
            head=head.next;

        }
        return true;
        
    }
    
}


