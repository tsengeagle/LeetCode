package AddTwoNumbers;

/**
 * Created by tsengeagle on 2017/06/06.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        result.val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
        if (result.val >= 10) {
            result.next = new ListNode(1);
            result.val = result.val - 10;
        }

        if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
            if (result.next != null) {
                result.next.val += addTwoNumbers(l1 == null ? new ListNode(0) : l1.next, l2 == null ? new ListNode(0) : l2.next).val;
            } else {
                result.next = addTwoNumbers(l1 == null ? new ListNode(0) : l1.next, l2 == null ? new ListNode(0) : l2.next);
            }
        }

        return result;
    }
}
