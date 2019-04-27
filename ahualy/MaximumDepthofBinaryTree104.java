package ahualy;




public class MaximumDepthofBinaryTree104 {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        int res = maxDepth(root);
        System.out.println(res);


    }


    public static int maxDepth(TreeNode root) {
        return  root == null ? 0 : 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

}
