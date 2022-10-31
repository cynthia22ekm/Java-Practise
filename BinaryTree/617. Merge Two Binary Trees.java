//617. Merge Two Binary Trees

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
TreeNode root3=root1;
return mergeTree(root1, root2,root3);

    }
public TreeNode mergeTree(TreeNode root1, TreeNode root2, TreeNode root3)
{
if(root1 ==null)
return root2 ;

if(root2==null)
return root1 ;

         root3.val = root1.val + root2.val;

         root3.left = mergeTrees(root1.left, root2.left);
         root3.right = mergeTrees(root1.right, root2.right);
return root3;
        
    }
}