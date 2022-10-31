//897. Increasing Order Search Tree


class Solution {
    public TreeNode increasingBST(TreeNode root) {
        
        List<Integer> numbers = new ArrayList<Integer>();

        increasing(numbers, root);
        TreeNode result = new TreeNode(numbers.get(0));
        TreeNode finalResult = result;
        for(int i=1;i<numbers.size();i++)
        {
             result.right=new TreeNode(numbers.get(i));
             result= result.right;
        }
        return finalResult;
    }

    public List increasing(List<Integer> numbers,TreeNode root )
    {

       if(root ==null)
       return null;
         
        increasing(numbers, root.left);
      numbers.add(root.val);
        increasing(numbers, root.right);
        return numbers;
    
    }
}