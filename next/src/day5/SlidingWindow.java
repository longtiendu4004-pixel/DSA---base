package day5;

import java.util.*;

public class SlidingWindow {
	public static int findLengthSameValue1(int[] arr) {
		if (arr.length == 0)
			return 0;
		int max = 1;
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 1;
			}
		}
		// cần kiểm tra lần cuối cùng
		max = Math.max(max, count);

		return max;
	}

	public static int findLengthSameValue2(int[] nums) {
		int n = nums.length;
	    int left = 0, right = 0;
	    int maxLen = 1;
	    while(right < n){
//	        if(nums[right] == nums[left]){
//	            maxLen = Math.max(maxLen, right - left + 1);
//	            right++;
//	        } else {
//	            left = right;
//	            right++;
//	        }
	    	if(nums[right] != nums[left]) {
	    		left = right;
	    	}
	    	maxLen = Math.max(maxLen, right - left + 1);
	    	right++;
	    }
	    return maxLen;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 3, 3, 3, 2, 2, 2, 2, 2 };
		System.out.print(findLengthSameValue2(arr));
	}
}
