import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class binaryToBst {
    static ArrayList<Integer> ar = new ArrayList<>();
    public static void main(String[] args) {
        Node root=getTree2();
        System.out.println(binaryTreeToBST(root));
        System.out.println(inorder(root, ar));
        
    }
    static int in=0;
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    public static Node binaryTreeToBST(Node root)
    {
       
       
       inorder(root, ar);
       
       Collections.sort(ar);
       
       solve(root,ar);
       
       return root;
    }
    
    static void inorder(Node n, List<Integer> ar){
        if(n==null)
        return;
        
        inorder(n.left, ar);
        
        ar.add(n.data);
        inorder(n.right, ar);
    }
    
    static void solve(Node n, List<Integer> ar){
        if(n==null)
            return;
            
        solve(n.left,ar);
        
        n.data = ar.get(in);
        in++;

        solve(n.right,ar);
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
