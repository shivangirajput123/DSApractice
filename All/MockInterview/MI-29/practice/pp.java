import java.util.ArrayList;
import java.util.List;
public class pp {
    public static void main(String[] args) {
        Node root1=getTree1();
        Node root2=getTree2();
        System.out.println(merger(root1, root2));

    }

    public static void inOrder(Node root, List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);

    }

    public static  List<Integer> merger(Node root1, Node root2){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        inOrder(root1, list1);
        inOrder(root2, list2);
       List<Integer> ans=new ArrayList<>();

        int i=0;
        int j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                ans.add(list1.get(i));
                i++;
                
            }
            else if(list1.get(i)>list2.get(j)){
                ans.add(list2.get(j));
                j++;
            }
            else{
                ans.add(list1.get(i));
                ans.add(list2.get(j));
                i++;
                j++;
            }
        }
        while(i<list1.size()){
            ans.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            ans.add(list2.get(j));
            j++;
        }
        return ans;
    }

    public static Node getTree1(){
        Node root=new Node(5);
        root.left=new Node(8);
        root.right=new Node(9);
        root.left.left=new Node(3);
        root.left.right=new Node(12);
        root.right.left=new Node(51);
        root.right.right=new Node(30);

        return root;
    }
    
    public static Node getTree2(){
        Node root=new Node(5);
        root.left=new Node(0);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(1);
        root.right.left=new Node(5);
        root.right.right=new Node(3);

        return root;
    }
    
}


class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}