public class largestBST {
    // Node root;
    public static void main(String[] args) {
        Node root=getTree();
        System.out.println(largestBST(root));
        
    }
    public static int largestBST(Node root){
        if (root == null)
            return 0;
 
        if (isBST(root))
            return size(root);
 
        return Math.max(largestBST(root.left), largestBST(root.right));
    }

    static boolean isBST(Node node){
        if (node == null)
            return true;            
        
        if (node.left != null && node.left.data > node.data)
            return false;
        
        
        if (node.right != null && node.right.data < node.data)
            return false;
        
        if (!isBST(node.left) || !isBST(node.right))
            return false;

        return true;
    }

    // int size(){
    //     return size(root);
    // }

    static int size(Node node){
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }


    public static Node getTree(){
        Node root=new Node(5);
        root.left=new Node(8);
        root.right=new Node(9);
        root.left.left=new Node(3);
        root.left.right=new Node(12);
        root.right.left=new Node(51);
        root.right.right=new Node(30);

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

