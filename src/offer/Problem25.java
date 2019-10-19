package offer;

import java.util.Stack;

/**
 * 面试题 25:二叉树中和为某一值的路径
 * 题目:输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 从树的根节点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 * 这道题的目的是考察二叉树的深度搜索
 */
public class Problem25 {
    public static void main(String[] args) {
        BinaryTreeNode root1=new BinaryTreeNode();
        BinaryTreeNode node1=new BinaryTreeNode();
        BinaryTreeNode node2=new BinaryTreeNode();
        BinaryTreeNode node3=new BinaryTreeNode();
        BinaryTreeNode node4=new BinaryTreeNode();
        root1.leftNode=node1; root1.rightNode=node2;
        node1.leftNode=node3; node1.rightNode=node4;
        root1.value=10;node1.value=5;node2.value=12;
        node3.value=4;node4.value=7;
        findPath(root1,22);
    }

    private static void findPath(BinaryTreeNode root, int sum) {
        if (root == null)
            return;
        Stack<Integer> stack = new Stack<>();
        int currentSum = 0;
        findPath(root,sum,stack,currentSum);
    }

    private static void findPath(BinaryTreeNode root, int sum, Stack<Integer> stack, int currentSum) {
        currentSum += root.value;
        stack.push(root.value);
        if (root.leftNode == null && root.rightNode == null) {
            if (currentSum == sum) {
                System.out.println("找到一个路径");
                for (int path : stack) {
                    System.out.print(path+" ");
                }
                System.out.println();
            }
        }
        if (root.leftNode != null)
            findPath(root.leftNode,sum,stack,currentSum);
        if (root.rightNode != null)
            findPath(root.rightNode,sum,stack,currentSum);
        stack.pop();
    }
}


















