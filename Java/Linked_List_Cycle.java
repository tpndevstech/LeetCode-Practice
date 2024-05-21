/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // If the list is empty or has only one node, there can't be a cycle
        if (head == null || head.next == null) {
            return false;
        }
        
        // Initialize two pointers: slow and fast
        ListNode slow = head;
        ListNode fast = head.next;
        
        // Traverse the list using the two pointers
        while (slow != fast) {
            // If the fast pointer reaches the end of the list, there's no cycle
            if (fast == null || fast.next == null) {
                return false;
            }
            
            // Move the slow pointer one step and the fast pointer two steps
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // If the slow and fast pointers meet, there's a cycle
        return true;
    }
}
