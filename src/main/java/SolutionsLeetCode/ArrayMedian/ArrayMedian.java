package SolutionsLeetCode.ArrayMedian;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class ArrayMedian {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double[] concat = new double[nums1.length + nums2.length];
		int j = 0;
		for (int i = 0; i < concat.length; i++) {
			if (i < nums1.length) {
				concat[i] = Double.valueOf(nums1[i]);
				continue;
			}
			concat[i] = nums2[j];
			j++;
		}
		concat = Arrays.stream(concat).sorted().toArray();

		if (concat.length % 2 != 0)//nieparzyste
		{
			return concat[(concat.length - 1) / 2];

		}
		BigDecimal IndexUp = new BigDecimal(Double.valueOf((concat.length) - 1) / 2).setScale(0, RoundingMode.HALF_UP);
		BigDecimal IndexDown = new BigDecimal(Double.valueOf((concat.length) - 1) / 2).setScale(0, RoundingMode.HALF_DOWN);
		double result = (concat[IndexUp.intValue()] + concat[IndexDown.intValue()]) / 2;
		return result;
	}
}
