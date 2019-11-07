import SolutionsLeetCode.LongestSubString.LongestSubString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LongestSubStringTest {


	LongestSubString test;

	@BeforeEach
	void setUp() {
		test = new LongestSubString();
	}

	@DisplayName("Should pass the method parameters provided by the test-data-data.csv file")
	@ParameterizedTest(name = "{index} => a={0}")
	@CsvFileSource(resources = "resources/InputTestContainsDuplicates1")
	void containsDuplicates(String a) {
		assertTrue(test.ContainsDuplicates(a));
	}

	@DisplayName("Should pass the method parameters provided by the test-data-data.csv file")
	@ParameterizedTest(name = "{index} => a={0};b={1}")
	@CsvFileSource(resources = "resources/InputTestLongestSubString")
	void lengthOfLongestSubstring(String input, int result) {
		if (result < 100) {
			assertEquals(result, test.lengthOfLongestSubstring(input));
		}
		int a = 1;
	}

	@DisplayName("Should pass the method parameters provided by the test-data-data.csv file")
	@ParameterizedTest(name = "{index} => a={0}")
	@CsvFileSource(resources = "resources/InputTestcontainsCharPairDuplicates")
	void containsCharPairDuplicates(String input) {
		assertTrue(test.ContainsCharPairDuplicates(input));
	}

}