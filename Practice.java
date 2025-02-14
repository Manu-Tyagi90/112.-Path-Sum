class TreeNode {
int val;
TreeNode left;
TreeNode rt;
TreeNode (int x) {
val =x;
}
}

public class Solution {
public static boolean pathSum (TreeNode root, int targetSum) {
if(root == null) return false;

if(root.left == null && root.rt == null && targetSum == root.val) {
return true;
}

if(pathSum(root.left,targetSum - root.val)){
return true;
}

if(pathSum(root.rt,targetSum - root.val)){
return true;
}


return false;
}
}
