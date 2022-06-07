import java.util.ArrayList;
public class findMedian {
    public static void main(String[] args){
        Node root=getTree();
        int answer=(int)findMedian(root);
        System.out.println(answer);
        
      
        
    }
    public static float findMedian(Node root){        
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int count=ans.size();
        int mid=count/2;
        if(count%2!=0){
            return ans.get((mid));
        }
        else{
            float even=ans.get(mid-1);
            float odd=ans.get(mid);
            float index=(even+odd)/2;
            return index;
        }
    }
    
   static void inorder(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        
        inorder(root.left,ans);
        ans.add(root.data);
        
        inorder(root.right,ans);
        
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
