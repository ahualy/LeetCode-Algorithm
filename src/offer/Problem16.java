package offer;

/**
 *面试题 16:反转链表
 * 题目:定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 *
 */
public class Problem16 {
    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        ListNode forth=new ListNode();
        head.next=second;
        second.next=third;
        third.next=forth;
        head.data=1;
        second.data=2;
        third.data=3;
        forth.data=4;
        ListNode resultListNode=reverseList(head);
        System.out.println(resultListNode.data);
    }

    public static ListNode reverseList(ListNode head){
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode preListNode=null;
        ListNode nowListNode=head;
        ListNode reversedHead=null;

        while (nowListNode.next != null) {
            ListNode nextListNode = nowListNode.next;
            if (nextListNode == null)
                reversedHead = nextListNode;
            nowListNode.next = preListNode;
            preListNode = nowListNode;
            nowListNode = nextListNode;
        }
        return nowListNode;
    }
}
