//1022. Sum of Root To Leaf Binary Numbers

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        int sum=0;

        return sum(root,sum);

    }
    public int sum(TreeNode root, int sum)
    {
        if(root == null)
        return 0;

        sum =(2* sum)+ root.val;
          if(root.left == null && root.right == null) return sum;

        return sum(root.left, sum)+ sum(root.right, sum);

    }
}