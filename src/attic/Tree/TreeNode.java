package attic.Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public class Solution {

        private long prevVal = (long) Integer.MIN_VALUE - 1;

        public boolean isValidBST(TreeNode root) {
            if (root == null)
                return true;
            if (!isValidBST(root.left))
                return false;
            if (!(prevVal < root.val))
                return false;
            prevVal = root.val;
            return isValidBST(root.right);
        }
    }
}





