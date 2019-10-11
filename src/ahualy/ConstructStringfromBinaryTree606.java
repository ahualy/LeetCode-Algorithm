package ahualy;

/**
 * You need to construct a string consists of parenthesis and integers from 
 * a binary tree with the preorder traversing way.
 *
 * The null node needs to be represented by empty parenthesis pair "()".
 * And you need to omit all the empty parenthesis pairs that don't affect the
 * one-to-one mapping relationship between the string and the original binary tree.
 * 
 * 给定一个二叉树，输出对应的字符串，就是一个中序遍历
 */
public class ConstructStringfromBinaryTree606 {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        String res = tree2str(t);
        System.out.println(res);
    }
    
    private static String tree2str(TreeNode t) {
        if (t==null) return "";
        if (t.left == null && t.right == null) {
            return t.val+"";
        }
        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) +")";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t.val);
        String s = tree2str(t.left);
        sb.append("("+ s +")");
        String s2 = tree2str(t.right);
        sb.append("("+ s2 +")");
        return sb.toString();
    }
}
