import java.util.ArrayList;

public class T1{
    public static void main(String[] args) {
        Node root1=getTree1();
        Node root2=getTree2();
        System.out.println(merge(root1, root2));
    }
    public static Node getTree1(){
        Node root1=new Node(5);
        root1.left=new Node(3);
        root1.right=new Node(6);
        root1.left.left=new Node(2);
        root1.left.right=new Node(4);

        return root1;

    }

    public static Node getTree2(){
        Node root2=new Node(2);
        root2.left=new Node(1);
        root2.right=new Node(3);
        root2.right.right=new Node(7);
        root2.right.right.left=new Node(6);

        return root2;

    }

    public static ArrayList<Integer> merge(Node root1, Node root2){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        inOrder(root1, list1);
        inOrder(root2, list2);
        ArrayList<Integer> ans=new ArrayList<>();

        int i=0;
        int j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }
            else{
                ans.add(list2.get(j));
                j++;
            }
            // else{
            //     ans.get(list1.get(i));
            //     ans.get(list2.get(j));
            //     i++;
            //     j++;
            // }
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
    public static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);

        return list;

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
// / \
// 2   4 

// BST2:
//    2
//  /   \
// 1     3
//        \
//         7
//        /
//       6