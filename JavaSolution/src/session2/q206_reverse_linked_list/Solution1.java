package session2.q206_reverse_linked_list;

import session2.common.ListBuilder;
import session2.common.ListNode;
import session2.common.PrintUtil;

public class Solution1 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        ListBuilder listBuilder = new ListBuilder(nums);
        PrintUtil.printList(reverseList(listBuilder.getHead()));
    }

    private static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
