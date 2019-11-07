import SolutionsLeetCode.SymmetricTree.SymmetricTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SymmetricTreeTest {

	SymmetricTree test;


	@CsvFileSource(resources = "/LeetCodeSolutions/src/test/resources/InputTestSymmetricTree")
	void setUp() {

		test = new SymmetricTree();
	}

	@ParameterizedTest(name = "{index} => a={0}")
	@CsvFileSource(resources = "/LeetCodeSolutions/src/test/resources/InputTestSymmetricTree")
	void IsPreoder(String a) {

	}

	@ParameterizedTest(name = "{index} => a={0}")
	@CsvFileSource(resources = "/LeetCodeSolutions/src/test/resources/InputTestSymmetricTree")
	void generateTreeEquals(String tree) {

	}

}