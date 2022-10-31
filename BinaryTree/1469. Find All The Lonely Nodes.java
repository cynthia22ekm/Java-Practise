//1469. Find All The Lonely Nodes
class Solution {
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> nodes = new ArrayList<Integer>();
return getNodes( root, nodes);
    }
        public List<Integer> getNodes(TreeNode root, List<Integer> nodes)
        {
if(root==null || (root.left ==null && root.right==null))
return nodes;
      else   if(root.left ==null) {
            if(root.right!=null)
            {
nodes.add(root.right.val);
            }
        }

       else  if(root.right ==null) {
            if(root.left!=null)
            {
nodes.add(root.left.val);

            }

        }
        getNodes(root.left,nodes);
        getNodes(root.right,nodes);
        
        return nodes;
        }
    
}