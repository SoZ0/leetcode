/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
        int length = nums1.length+nums2.length;
        int[] array = Arrays.copyOf(nums1, length);
        System.arraycopy(nums2, 0, array, nums1.length,nums2.length);

        Arrays.sort(array);

        if(array.length % 2 == 0){
            
        }

        return 0;
    }
}
// @lc code=end

