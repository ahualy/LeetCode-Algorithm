package ahualy;

/**
 * Given the root node of a binary search tree, return the sum of values of all nodes
 * with value between L and R (inclusive).
 *
 * The binary search tree is guaranteed to have unique values.
 */
public class RangeSumofBST938 {

    public static void main(String[] args) {


        //二叉树每个节点的值是唯一的不重复
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);

        int L = 7;
        int R = 15;

        int res = rangeSumBST(root, L, R);

        System.out.println(res);
    }

    private static int rangeSumBST(TreeNode root, int L, int R) {



        if (root == null) return 0;
        if (root.val >= L && root.val <= R)
            return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
        else
            return rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);

    }
}
