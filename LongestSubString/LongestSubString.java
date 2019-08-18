package SolutionsLeetCode.LongestSubString;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public boolean ContainsDuplicates(String nums) {

		Set<Character> set = new HashSet<>();
		for (char t : nums.toCharArray()) {
			// Add each element into the set
			set.add(t);
		}
		return set.size() != nums.length();
	}

	public boolean ContainsCharPairDuplicates(String nums) {
		for (int i = 0; i < nums.length() - 1; i++) {
			if (nums.charAt(i) == nums.charAt(i + 1)) {
				return true;
			}
		}
		return false;
	}

//    public int lengthOfLongestSubstring(String s) {
//
//        Set<Character> set = new HashSet<>();
//        for (char t : s.toCharArray()) {
//            // Add each element into the set
//            set.add(t);
//        }
//        return set.size();
//    }


	public int lengthOfLongestSubstring(String s) {
		Set<Character> charset = new HashSet<Character>();
		int left = 0;
		int max = 0;
		int right = 0;
		while (right < s.length()) {
			if (!charset.contains(s.charAt(right))) {
				charset.add(s.charAt(right));
				right++;
				max = Math.max(max, charset.size());
			} else {
				charset.remove(s.charAt(left));
				left++;
			}
		}
		return max;
	}
}

