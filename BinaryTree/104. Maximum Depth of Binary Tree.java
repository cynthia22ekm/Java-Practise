//104. Maximum Depth of Binary Tree

class Solution {
    public int maxDepth(TreeNode root) {
        int depth=0;
 return findDepth(root,depth);

    }
    public int findDepth(TreeNode root, int depth)
    {

        if (root == null) {
            return depth;
        }
        
     return  Math.max( findDepth(root.left, depth+1),
       findDepth(root.right,depth+1));
    }
}