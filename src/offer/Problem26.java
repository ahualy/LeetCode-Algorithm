package offer;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

/**
 * 面试题 26:复杂链表的复制
 * 题目:实现函数复制一个复杂链表。在复杂链表中，每个结点除了有一个next指针指向下一个结点外，还有一个指向链表中任意结点或 null。
 */
class ComplexListNode {
    int data;
    ComplexListNode next;
    ComplexListNode sibling;
}
public class Problem26 {
    public static void main(String[] args) {
        ComplexListNode root=new ComplexListNode();
        ComplexListNode node1=new ComplexListNode();
        ComplexListNode node2=new ComplexListNode();
        ComplexListNode node3=new ComplexListNode();
        ComplexListNode node4=new ComplexListNode();
        root.data=1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        root.data=1;
        node1.data=2;
        node2.data=3;
        node3.data=4;
        node4.data=5;
        root.sibling=node1;
        node1.sibling=root;
        node3.sibling=node1;
        ComplexListNode res = clone(root);
        System.out.println(res.data);
    }

    private static ComplexListNode clone(ComplexListNode head) {
        cloneNodes(head);
        connectSiblingNodes(head);
        return reconnectNodes(head);
    }

    private static ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode node = head;
        ComplexListNode clonedHead = null;
        ComplexListNode clonedNode = null;
        if(node!=null){
            clonedNode=node.next;
            clonedHead=clonedNode;
            node.next=clonedNode.next;
            node=node.next;
        } while(node!=null){
            clonedNode.next=node.next;
            clonedNode=clonedHead.next;
            node.next=clonedNode.next;
            node=node.next;
        }
        return clonedHead;
    }

    private static void connectSiblingNodes(ComplexListNode head) {
        ComplexListNode node = head;
        while (node != null) {
            ComplexListNode cloneNode = node.next;
            if (node.sibling != null) {
                cloneNode.sibling = node.sibling.next;
            }
            node = cloneNode.next;
        }
    }

    private static void cloneNodes(ComplexListNode head) {
        ComplexListNode node = head;
        while (node != null) {
            ComplexListNode cloneNode = new ComplexListNode();
            cloneNode.data = node.data;
            cloneNode.next = node.next;
            cloneNode.sibling = null;
            node.next = cloneNode;
            node = cloneNode.next;
        }
    }
}
