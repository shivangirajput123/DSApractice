public class T1{
    public static int  findingMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        else{
           return Math.max(root.data, Math.max(findingMax(root.left),findingMax(root.right)));
        }      
        
    }
    public static void main(String[] args) {
        Node root=getTree();
        int ans=findingMax(root);
        
        System.out.println(ans);
    }
    public static Node getTree(){
        Node root=new Node(-10);
        Node node1=new Node(-5);
        Node node2=new Node(-3);
        Node node3=new Node(-2);
        Node node4=new Node(-8);
        Node node5=new Node(-10);
        Node node6=new Node(-6);

        root.left=node1;
        root.right=node2;

        node1.left=node3;
        node1.right=node4;

        node2.left=node5;
        node2.right=node6;


        return root;        
    }   
    
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}