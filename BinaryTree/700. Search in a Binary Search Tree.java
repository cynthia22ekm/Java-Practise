//700. Search in a Binary Search Tree

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        return searchNode(root, val);
    }

  public TreeNode searchNode(TreeNode root, int val)
  {      
        if(root == null)
        return null;

        if(val==root.val)
        {
            return root;
        }

        if(val<root.val)
        {
            
              return searchNode(root.left,val);
        }
        else
        {
             return searchNode(root.right, val);
        }
       
  }
    
}