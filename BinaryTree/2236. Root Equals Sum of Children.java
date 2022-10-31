//2236. Root Equals Sum of Children

class Solution {
    public boolean checkTree(TreeNode root) {
        
        int leftVal = root.left.val;
        int rightVal = root.right.val;
        int sum = leftVal + rightVal;
        
        return sum==root.val;
    }
}