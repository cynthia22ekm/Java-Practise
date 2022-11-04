//94. Binary Tree Inorder Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode cur = root;

    while(cur!=null || !stack.empty()){
        while(cur!=null){
            stack.add(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        list.add(cur.val);
        cur = cur.right;
    }

    return list;
    }
}

//recursive solution

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<Integer> temp = new Stack<Integer>();

         return traverse(root,temp, result);
    }

    public List traverse(TreeNode root, Stack<Integer> temp, List<Integer> result)
    {
        if(root ==null)
        {
            return result;
        }

        temp.add(root.val);

        traverse(root.left, temp, result);
        result.add(temp.pop());
        traverse(root.right, temp, result);

        return result;
}
    }