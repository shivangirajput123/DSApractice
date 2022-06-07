import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    static Map<Integer, ArrayList<Integer>> map=new HashMap<>();
    public static void main(String[] args) {
        Node root=getTree();
        // InOrder(root, 0, map);
        VerticalOrder(root, 0, map);

        for(Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()){
            System.out.print(entry.getKey() + "->" + entry.getValue());
        }
       

        

    }
    public static void VerticalOrder(Node root, int level, Map<Integer, ArrayList<Integer>> map){

        if (map.get(root) == null) {
            map.put(root, new TreeMap<Integer, List<Integer>>());
        }
        
        // initialize for null row map
        if (map.get(columnIndex).get(row) == null) {
            map.get(columnIndex).put(row, new ArrayList<Integer>());
        }


      
        VerticalOrder(root.left, level - 1, map);        
        VerticalOrder(root.right, level +1, map);

    }
    

    public static void InOrder(Node root){
        if(root == null){
            return;
        }

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);

    }
    public static Node getTree() {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
       

        root.left.left=new Node(4);
        root.left.right=new Node(5);


       root.right.left=new Node(6);
       root.right.right=new Node(7);


      
        root.right.right.right=new Node(9);

        return root;
        
    }
}
    // // 4 2 5 1 6 8 3 7 9
    // {-2: 4, -1: 2, 0: [1, 5 ,6], 1:[3, 8], 2: 7, 3: 9 }
    // 4-> -2 
    // 2-> -1
    // 1 5 6 ->0 0 0
    // 3 8->  +1 +1
    // 7-> +2
    // 9-> +3
    // }

class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data=data;
        right=left=null;
    }
}