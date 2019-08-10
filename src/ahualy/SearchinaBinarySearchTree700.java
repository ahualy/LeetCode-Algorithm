package ahualy;

public class SearchinaBinarySearchTree700 {

    public static void main(String[] args) {


        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);



        TreeNode res = searchBST(root,2);

        System.out.println(res);

    }


    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val == val)
            return root;
        else if (val > root.val)
            return searchBST(root.right,val);
        else
            return searchBST(root.left,val);

    }
}
