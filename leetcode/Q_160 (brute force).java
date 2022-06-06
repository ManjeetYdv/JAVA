/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        
        while(ptr2!=null){
            
            while(ptr1!=null){
                if(ptr1!=ptr2){
                    ptr1= ptr1.next;
                }
                else{
                    return ptr2;
                }
            }
            ptr1 = headA;
            ptr2 = ptr2.next;
        }
        return null;
    }
}
