import SolutionsLeetCode.ArrayMedian.ArrayMedian;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayMedianTest {

	ArrayMedian find;

	@BeforeEach
	void setUp() {
		find = new ArrayMedian();
	}

	@DisplayName("Should calculate the correct sum on secondo")
	@ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
	@CsvFileSource(resources = "/LeetCodeSolutions/src/test/resources/InputTestArrayMedian")
	void findMedianSortedArraysTest(String a, String b, double c) {
		int[] ar = Arrays.stream(a.substring(1, a.length() - 1).split(","))
				.map(String::trim).mapToInt(Integer::parseInt).toArray();
		int[] br = Arrays.stream(b.substring(1, b.length() - 1).split(","))
				.map(String::trim).mapToInt(Integer::parseInt).toArray();

		assertEquals(c, find.findMedianSortedArrays(ar, br));
		if (new StringBuilder("aa") == new StringBuilder("aa")) {

		}
	}

	@Test
	void Test() {
	}

}