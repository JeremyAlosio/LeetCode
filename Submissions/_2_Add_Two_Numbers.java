//https://leetcode.com/problems/add-two-numbers/
// #2
// Medium

public class _2_Add_Two_Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode sum = new ListNode(0);
		ListNode head = sum;
		int currentTotal = 0;

		while (l1 != null || l2 != null) {
			if (l1 != null) {
				currentTotal += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				currentTotal += l2.val;
				l2 = l2.next;
			}

			if (carry == 1) {
				currentTotal += 1;
				carry = 0;
			}

			if (currentTotal > 9) {
				carry = 1;
				currentTotal -= 10;
			}

			sum.next = new ListNode(currentTotal);
			sum = sum.next;
			currentTotal = 0;
		}

		if (carry == 1)
			sum.next = new ListNode(1);

		return head.next;

	}
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}

