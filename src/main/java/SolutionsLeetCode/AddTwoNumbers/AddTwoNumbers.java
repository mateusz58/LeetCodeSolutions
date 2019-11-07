package SolutionsLeetCode.AddTwoNumbers;

import Structures.ListNode;
import java.math.BigDecimal;
//change
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder build = new StringBuilder();
		BigDecimal sum = new BigDecimal(0);
		while (true) {
			if (l1 != null) {
				build.append(l1.val);
				l1 = l1.next;
				if (l1 == null) {
					build.reverse();
					sum = sum.add(new BigDecimal(build.toString()));
					build = new StringBuilder();
				}
				continue;
			}
			if (l2 != null) {
				build.append(l2.val);
				l2 = l2.next;
				if (l2 == null) {
					build.reverse();
					sum = sum.add(new BigDecimal(build.toString()));
					break;
				}
			}
		}
		ListNode head = new ListNode(Character.getNumericValue(sum.toString().charAt(sum.toString().length() - 1)));
		if (sum.toString().length() < 2) {
			return head;
		}
		ListNode last = new ListNode(Character.getNumericValue(sum.toString().charAt(sum.toString().length() - 2)));
		head.next = last;
		for (int i = sum.toString().length() - 3; i >= 0; i--) {
			ListNode temp = new ListNode(Character.getNumericValue(sum.toString().charAt(i)));
			last.next = temp;
			last = temp;
		}
		return head;

	}
}
