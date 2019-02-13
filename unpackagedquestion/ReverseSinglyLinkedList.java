/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

package unpackagedquestion;
import java.util.*;

public class ReverseSinglyLinkedList {
    // https://leetcode.com/problems/reverse-linked-list/
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while(curr != null) {
    //         ListNode nextTemp = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = nextTemp;
    //     }
    //     return prev;

    // }
    // public ListNode reverseList(ListNode head) {
    //     return reverse(head, null);
    // }
    // public ListNode reverse(ListNode head, ListNode newhead) {
    //     if(head == null) {return newhead;}
    //     ListNode tempNext = head.next;
    //     head.next = newhead;
    //     return reverse(tempNext, head);
    // }
}
