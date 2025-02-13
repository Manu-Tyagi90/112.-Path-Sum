import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
public static boolean hasPathSum(TreeNode root, int targetSum) {
if(root == null) return false;

Stack<TreeNode> route = new Stack<>();
Stack<Integer> sum = new Stack<>();

route.push(root);
sum.push(root.val);

while(!route.isEmpty()) {

TreeNode current = route.pop();
int currentSum = sum.pop();

if(current.left ==null && current.right == null && currentSum == targetSum) {
return true;
}
if(current.left !=null ) {
route.push(current.left);
sum.push(current.left.val + currentSum);
}
if(current.right !=null ) {
route.push(current.right);
sum.push(current.right.val + currentSum);
}
}
return false;
}
}
