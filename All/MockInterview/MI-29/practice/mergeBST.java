import java.util.ArrayList;
import java.util.List;
public class mergeBST {
    public static void main(String[] args) {
        Node root1=getTree1();
        Node root2=getTree2();
        System.out.println(merge(root1, root2));
    }
    static void inorder(Node root,List<Integer>list)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        List<Integer>res=new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<list1.size() && j<list2.size())
        {
            if(list1.get(i)<list2.get(j))
            {
                res.add(list1.get(i));
                i++;
            }
            else if(list1.get(i)>list2.get(j))
            {
                res.add(list2.get(j));
                j++;
            }
            else
            {
                res.add(list1.get(i));
                res.add(list2.get(j));
                i++;
                j++;
            }
        }
        while(j<list2.size())
        {
            res.add(list2.get(j));
            j++;
        }
        while(i<list1.size())
        {
            res.add(list1.get(i));
            i++;
        }
        return res; 
        
        
        
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