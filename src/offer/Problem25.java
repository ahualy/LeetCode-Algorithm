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
        BinaryTreeNode node5=new BinaryTreeNode();
        BinaryTreeNode node6=new BinaryTreeNode();
        BinaryTreeNode node7=new BinaryTreeNode();
        BinaryTreeNode node8=new BinaryTreeNode();
        BinaryTreeNode node9=new BinaryTreeNode();
        BinaryTreeNode node10=new BinaryTreeNode();
        root1.leftNode=node1; root1.rightNode=node2;
        node1.leftNode=node3; node1.rightNode=node4;
        node2.leftNode = node5;node2.rightNode=node6;
        node4.leftNode=node7;node4.rightNode = node8;
        node6.leftNode=node9;node6.rightNode=node10;
        root1.value=10;node1.value=5;node2.value=12;
        node3.value=21;node4.value=7;node5.value=14;
        node6.value=8;node7.value=25;node8.value=28;
        node9.value=23;node10.value=13;
        findPath(root1,36);
        Stack<Integer> stack = new Stack<>();
        deepSearch(root1,stack);
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
    private static void deepSearch(BinaryTreeNode root,Stack<Integer> stack) {
//        通过栈来存储每一次访问的节点
        stack.push(root.value);
        if (root.leftNode == null && root.rightNode == null) {
            String res = "";
            for (int path : stack) {
                res = res+path+"->";
            }
            System.out.println(res.substring(0,res.length()-2));
        }
//        对每个节点进行递归调用
        if (root.leftNode != null)
            deepSearch(root.leftNode,stack);
        if (root.rightNode != null)
            deepSearch(root.rightNode,stack);
        stack.pop();
    }
}


















