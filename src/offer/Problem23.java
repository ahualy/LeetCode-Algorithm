package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题 23:从上往下打印二叉树
 * 题目:从上往下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印。
 *
 * 二叉树的层次遍历
 */
public class Problem23 {
    public static void main(String[] args) {
        BinaryTreeNode root1=new BinaryTreeNode();
        BinaryTreeNode node1=new BinaryTreeNode();
        BinaryTreeNode node2=new BinaryTreeNode();
        BinaryTreeNode node3=new BinaryTreeNode();
        BinaryTreeNode node4=new BinaryTreeNode();
        BinaryTreeNode node5=new BinaryTreeNode();
        BinaryTreeNode node6=new BinaryTreeNode();
        root1.leftNode=node1;
        root1.rightNode=node2;
        node1.leftNode=node3;
        node1.rightNode=node4;
        node4.leftNode=node5;
        node4.rightNode=node6;
        root1.value=8;
        node1.value=8;
        node2.value=7;
        node3.value=9;
        node4.value=2;
        node5.value=4;
        node6.value=7;
        printFromTopToBottom(root1);
    }

    private static void printFromTopToBottom(BinaryTreeNode root) {
        if (root == null)
            return;
//        该队列 是通过LinkedList实现
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            System.out.println(node.value);
            if (node.leftNode != null)
                queue.add(node.leftNode);
            if (node.rightNode != null)
                queue.add(node.rightNode);
        }
    }
}























