package offer;

import java.util.Stack;

/**
 * 面试题 5:从尾到头打印链表
 * 题目:输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 */

class ListNode{
    int data;
    ListNode next;
}

public class PrintListReverse {
    public static void main(String args[]) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node1.next = node2;
        node2.next = node3;
        printListReverse(node1);
        printListReverse2(node1);
    }
//    第二种方式采用递归方式
    private static void printListReverse2(ListNode node) {
        if (node != null) {
            if (node.next != null) {
                printListReverse2(node.next);
            }
        }
        System.out.println(node.data);
    }

    //  第一种方法，就是非递归的方法
    private static void printListReverse(ListNode node) {
        Stack<ListNode> stack = new Stack<>();
        while (node != null ) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().data);
        }
    }
}
