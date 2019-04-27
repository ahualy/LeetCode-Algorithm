package ahualy;

public class MinimumDepthofBinaryTree111 {

    private static int num = 0;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        int res = minDepth(root);
        System.out.println("res "+res);

    }

    private static int minDepth(TreeNode root) {

        if (root == null) return 0;
        int leftMinDepth = minDepth(root.left);//一直等这句话执行完了，再去接着执行下一句
        int rightMimDepth = minDepth(root.right);
        num++;
        System.out.println("num "+num+" left "+leftMinDepth+" right "+rightMimDepth);
        return (leftMinDepth == 0 || rightMimDepth == 0)
                ? leftMinDepth + rightMimDepth + 1
                : Math.min(leftMinDepth,rightMimDepth) + 1;
    }
}
