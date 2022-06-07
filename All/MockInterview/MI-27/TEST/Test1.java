import java.util.ArrayList;

public class Test1 {
    ArrayList<Node> InOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        InOrder(root.left, list);
        list.add(root.data);
        InOrder(root.right, list);

        return list;
    }

    CalculateSum(TreeNode root, int target){
        ArrayList<Node> a1=new ArrayList<>();
        ArrayList<Node> a2=InOrder(root, a1);

        int start=0;
        int end=a2.size()-1;

        while(start<end){
            if(a2.get(start) + a2.get(end) + target <= target){
                System.out.println(a2.get(start) + " " + a2.get(end) + " " + target);
            }
            else{
                start++;
                end--;
            }
        }

    }
    
}

// There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However,
 you cannot enter a locked room without having its key. When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, 
 denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, 
return true if you can visit all the rooms, or false otherwise.

// 
// Input: rooms = [[1,3],[3,0,1],[2],[0]]