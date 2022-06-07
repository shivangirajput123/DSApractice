import java.util.LinkedList;
import java.util.Queue;

public class T1{
    public static void main(String[] args) {
        Node root=getTree();
        // preOrder(root); 
        int level=getHieght(root);
        int sum[]=new int[level];
        countNode(root, 0, sum);
        traversing(sum, level);

        
    }


    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }


    public static void traversing(int[] sum, int n){
        for(int i=0; i<n; i++){
            System.out.println(sum[i]);
        }
    }


    public static int getHieght(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(getHieght(root.left), getHieght(root.right)) + 1;

    }

    public static void countNode(Node root, int level, int[] sum){
        if(root == null){
            return;
        }
            
            sum[level]+=root.data;

            countNode(root.left, level+1, sum);
            countNode(root.right, level+1, sum);
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



    // public static void countNode(Node root, int sum[]){
    //     Queue<Integer> q=new LinkedList<>();
    //     if(root == null){
    //         return;
            
    //         while(!q.isEmpty()){
    //             int curr=q.poll();
    //             int i=0;
    //             sum[i++]=curr;

    //             if(q.isEmpty()){
    //                 q.add(null);
    //             }


    //         }
    //     }

    // }
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
