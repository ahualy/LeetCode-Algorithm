package offer;

/**
 * 面试题 13:在 O(1)时间删除链表结点
 * 题目:给定单向链表的头指针和一个结点指针，定义一个函数在 O(1)时间删除该结点。
 */
public class Problem13 {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        head.next = second;
        second.next = third;
        head.data = 1;
        second.data  = 2;
        third.data = 3;
        deleted(head,second);
        System.out.println(head.next.data);
    }

    private static void deleted(ListNode head, ListNode deListNode) {
        if (head == null || deListNode == null)
            return;
//        删除头节点
        if (head == deListNode )
            head = null;
        else {
            if (deListNode.next == null) {  // 删除尾节点
                ListNode pointListNode = head;
                while (pointListNode.next.next != null) {
                    pointListNode = pointListNode.next;
                }
                pointListNode.next = null;
            } else {
                deListNode.data = deListNode.next.data;
                deListNode.next = deListNode.next.next;
            }
        }
    }
}
