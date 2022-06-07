public class T1{
    public void delete(int pos){
        Node temp=head;
        int curr_pos=1;

        if(temp == null){
            return;
        }
        while(curr_pos != pos-1){
            temp=temp.next;
            curr_pos++;
        }
        Node delete=temp.next;
        temp.next=delete.next;
        delete.next=null;

    
    }

}