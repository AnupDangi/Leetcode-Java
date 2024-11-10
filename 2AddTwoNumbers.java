/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode ptr=result;
        ListNode current1=l1;
        ListNode current2=l2;
        int carry=0; // track carry in every addition

        while(current1!=null || current2!=null||carry!=0)
        {
            int sum=carry;
            if(current1!=null)
            {
                sum+=current1.val;
                current1=current1.next;
            }
            if(current2!=null)
            {
                sum+=current2.val;
                current2=current2.next;
            }
            ptr.next=new ListNode(sum%10);
            carry=sum/10;
            ptr=ptr.next;
        }

        return result.next;
    }
}
