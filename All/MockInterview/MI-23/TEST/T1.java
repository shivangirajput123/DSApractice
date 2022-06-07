public class T1 {
    public static Node view(Node root){
        if(root == null){
            return;
        }

      Node mirror=new Node(root.data);
      mirror.left=view(root.right);
      mirror.right=view(root.left);

      return mirror;


    }

    public void mirrorView(){
        
    }

    public static Node findSum(Node root){
        if(root == null){
            return 0;
        }
        int val=root.data;

        root.data=findSum(root.left) + findSum(root.right);
        return root.data+val;

       

    }
    Input :
    10
 /      \
-2        6
/   \     /  \
8     -4   7    5

Output:     
   20
 /    \
4        12
/  \     /  \
0     0   0    0



}







Node temp=root.left+root.right;
q.add(temp);

while(!q.isEmpty()){
    
    Node curr=q.poll();
    System.out.println(curr.data + " ");

    if(root.left != null){
        q.add(root.left);
    }
    if(root.right != null){
        q.add(root.right);
    }
}