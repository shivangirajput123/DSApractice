import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
class Node{
    Node right;
    Node left;
    int data;
    Node(int data){
        this.data=data;
        right=left=null;
    }
}

class binaryTree {
    Node root;
    public binaryTree(){
        root=null;
    }
    private void top(Node root){
        class ObjNode{
            Node node;
            int hd;
            ObjNode(Node root, int hd){
                this.hd=hd;
                this.node=node;
            }
        } 
        Queue<ObjNode> q=new LinkedList<ObjNode>();
        Map<Integer, Node> m=new TreeMap<Integer, Node>();
        if(root == null){
            return;
        }
        else{
            q.add(new ObjNode(root, 0));
        }

        while(!q.isEmpty()){
            ObjNode tempNode=q.poll();
            if(!m.containsKey(tempNode.hd)){
                m.put(tempNode.hd, tempNode.node);
            }
            if (tempNode.node.left != null) {
				q.add(new ObjNode(tempNode.node.left,tempNode.hd - 1));
			}
            if(tempNode.node.right != null){
                q.add(new ObjNode(tempNode.node.right, tempNode.hd+1));
            }
        }
        for(Map.Entry<Integer, Node> entry:m.entrySet()){
            System.out.println(entry.getValue().data);
        }
    }

    public static void main(String[] args){
    	binaryTree tree = new binaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.left.right.right = new Node(5);
		tree.root.left.right.right.right = new Node(6);
	
		tree.top(tree.root);     
    }
}

