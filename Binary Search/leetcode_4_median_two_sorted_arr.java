// Striver's SDE Sheet - Binary Search - Leetcode Q4 - Median of Two Sorted Arrays - Java

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).
// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// Constraints:
// nums1.length == m
// nums2.length == n
// 0 <= m <= 1000
// 0 <= n <= 1000
// 1 <= m + n <= 2000
// -106 <= nums1[i], nums2[i] <= 106package 



// Time:O(log(min(n1,n2))) -> n1 and n2 are lengths of given arrays
// Space:O(1)
public class leetcode_4_median_two_sorted_arr {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1=a.length, n2=b.length;
        if(n1>n2) return findMedianSortedArrays(b, a);

        int n= n1+n2;
        int low = 0, high = n1;

        while(low <= high){
            int mid1 = (low + high) >> 1;
            int mid2 = ((n+1) >> 1) - mid1;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }

        return 0;
    }
}
