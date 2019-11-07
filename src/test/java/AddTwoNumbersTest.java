import SolutionsLeetCode.AddTwoNumbers.AddTwoNumbers;
import Structures.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;


class AddTwoNumbersTest {

	AddTwoNumbers solution;
	ListNode L1;
	ListNode L2;
	ListNode result;
	ListNode Head;
	ListNode Tail;

	@BeforeEach
	void setUp() {

		solution = new AddTwoNumbers();
	}


	@DisplayName("Should pass the method parameters provided by the test-data-data.csv file")
	@ParameterizedTest(name = "{index} => a={0}; b={1}; c={2}")

	@CsvFileSource(resources = "InputTestAddTwoNumbers")
	void addTwoNumbers(String a, String b, String c) {

		int[] ar = Arrays.stream(a.substring(1, a.length() - 1).split(","))
				.map(String::trim).mapToInt(Integer::parseInt).toArray();

		int[] br = Arrays.stream(b.substring(1, b.length() - 1).split(","))
				.map(String::trim).mapToInt(Integer::parseInt).toArray();

		int[] cr = Arrays.stream(c.substring(1, c.length() - 1).split(","))
				.map(String::trim).mapToInt(Integer::parseInt).toArray();

		Head = new ListNode(ar[0]);
		if (ar.length > 1) {
			Tail = new ListNode(ar[1]);
			Head.next = Tail;
			for (int i = 2; i < ar.length; i++) {
				ListNode temp = new ListNode(ar[i]);
				Tail.next = temp;
				Tail = temp;
			}
		}
		L1 = Head;

		Head = new ListNode(br[0]);
		if (br.length > 1) {
			Tail = new ListNode(br[1]);
			Head.next = Tail;
			for (int i = 2; i < br.length; i++) {
				ListNode temp = new ListNode(br[i]);
				Tail.next = temp;
				Tail = temp;
			}
		}
		L2 = Head;

		Head = new ListNode(cr[0]);
		if (cr.length > 1) {
			Tail = new ListNode(cr[1]);
			Head.next = Tail;
			for (int i = 2; i < cr.length; i++) {
				ListNode temp = new ListNode(cr[i]);
				Tail.next = temp;
				Tail = temp;
			}
		}
		result = Head;

		Assertions.assertTrue(solution.addTwoNumbers(L1, L2).equals(result));
	}
}