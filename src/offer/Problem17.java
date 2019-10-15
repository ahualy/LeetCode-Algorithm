package offer;

/**
 * 面试题 17:合并两个排序的链表
 * 题目:输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按 照递增排序的。
 */
public class Problem17 {
    public static void main(String[] args) {
        ListNode head1=new ListNode(); ListNode second1=new ListNode(); ListNode head2=new ListNode(); ListNode second2=new ListNode();
        ListNode third2=new ListNode(); head1.next=second1; head2.next=second2; second2.next=third2; head1.data=1;
        second1.data=3;
        head2.data=2;
        second2.data=2;
        third2.data=2;
        ListNode res = mergeList(head1, head2);
        System.out.println(res.next.next.next.next.data);
    }

    public static ListNode mergeList(ListNode head1,ListNode head2) {
        if(head1==null){
            return head2;
        }else if(head2==null){
            return head1;
        }
        ListNode mergeHead=null;
        if(head1.data<head2.data){
            mergeHead=head1;
            mergeHead.next=mergeList(head1.next,head2);
        }else{
            mergeHead=head2;
            mergeHead.next=mergeList(head1, head2.next);
        }
        return mergeHead;
    }
}
