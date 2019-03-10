package mergetwotortedlist;
/**
 * Question: https://leetcode.com/problems/merge-two-sorted-lists/
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */



public class Test {
  // public static void mergeTwoLists(ListNode l1, ListNode l2) {
  //       ListNode ptr1 = l1;
  //       ListNode ptr2 = l2;
  //       while(l1.next != null || l2.next != null){
  //         if(l1.val <= l2.val) {
  //           ptr1 = l1.next;
  //           ptr2 = l2.next;
  //           l1.next = l2;
  //           l2 = ptr2;
  //           l1 = ptr1;
  //           System.out.println(l1.val);
  //         } else {
  //           ptr1 = l1.next;
  //           ptr2 = l2.next;
  //           l2.next = l1;
  //           l2 = ptr2;
  //           l1 = ptr1;
  //           System.out.println(l2.val);
  //         }
  //       }
  //     }
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    ListNode ptr = l1;
    while(ptr != null) {
      System.out.println(ptr.val);
      ptr = ptr.next;
    }
  }
}