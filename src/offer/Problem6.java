package offer;

import java.util.Arrays;

/**
 * 面试题 6:重建二叉树
 * 题目描述:输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
 * 假设前序遍历和中序遍历结果中都不包含重复的数字，例如输入的
 * 前序遍历序列 {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}重建出如图所示的二叉树。
 */
class BinaryTreeNode {
    public int value;
    public BinaryTreeNode leftNode;
    public BinaryTreeNode rightNode;
}

public class Problem6 {
    public static void main(String[] args) throws Exception {
        int[] preSort={1,2,4,7,3,5,6,8};
        int[] inSort={4,7,2,1,5,3,8,6};
        BinaryTreeNode root = constructCore(preSort,inSort);
        System.out.println(root.leftNode.leftNode.value);
    }
    private static BinaryTreeNode constructCore(int[] preOrder, int[] inOrder) throws Exception {
        if (preOrder == null || inOrder == null)
            return null;
        if (preOrder.length != inOrder.length)
            throw new Exception("长度不一样，非法的输入");
        BinaryTreeNode root = new BinaryTreeNode();
        for (int i = 0; i < inOrder.length; i++) {
//            找根的过程
            if (inOrder[i] == preOrder[0]) {
//                处理左子树
                root.value = inOrder[i];
                root.leftNode = constructCore(Arrays.copyOfRange(preOrder,1,i + 1),Arrays.copyOfRange(inOrder,0,i));
                root.rightNode = constructCore(Arrays.copyOfRange(preOrder,i + 1,preOrder.length),Arrays.copyOfRange(inOrder,i + 1,inOrder.length));
            }
        }
        return root;
    }
}
