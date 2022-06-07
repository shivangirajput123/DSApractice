import java.util.ArrayList;

public class t2 {
    public static void main(String[] args) {
        Node root=getTree();
        isBalance(root);

    }
    public static Node getTree(){
        Node root1=new Node(5);
        root1.left=new Node(3);
        root1.right=new Node(6);
        root1.left.left=new Node(2);
        root1.left.right=new Node(4);
        root1.right.left=new Node(3);
        root1.right.right=new Node(5);

        return root1;

    }

    public static boolean isBalance(Node root){
        if(root == null){
            return false;
        }
        // postOreder(root);
        if(postOreder(root.left) == postOreder(root.right)){
            return true;
        }
        return false;           
          
    }
    public static Node postOreder(Node root, l){
        if(root == null){
            return null;
        }

        postOreder(root.left);
        root
        postOreder(root.right);
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

// 5
// /   \
// 3     6
// / \      / \
// 2   4   3   5 