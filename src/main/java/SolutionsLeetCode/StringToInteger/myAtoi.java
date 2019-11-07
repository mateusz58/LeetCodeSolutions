package SolutionsLeetCode.StringToInteger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myAtoi {

	private Pattern removeHeadWhitespace = Pattern.compile("\\s*([\\S]*)");

	private Pattern filteroutDigit = Pattern.compile("\\D*[-+]*([1-9][0-9]+)");

	public String discardLeadingWhiteSpace(String input) {

		Matcher matcher = removeHeadWhitespace.matcher(input);
		matcher.matches();
		return matcher.group(1);

	}

}
