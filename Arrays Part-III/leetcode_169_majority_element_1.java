// Striver's SDE Sheet - Array3 - Leetcode Q169 - Java

// 169. Majority Element

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109
 
// Follow-up: Could you solve the problem in linear time and in O(1) space?



// Optimal Approach
// Time:O(n)
public class leetcode_169_majority_element_1 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt=0;
        int el = nums[0];
        for(int i=0; i<n; i++){
            if(cnt++ == 0) el = nums[i];
            if(nums[i] == el) cnt++;
            else cnt--;
        }
        return el;
    }
}

// Normal approach 1
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         for(int i=0; i<n; i++){
//             if(nums[i] == nums [i+n/2]) return nums[i];
//         }
//         return 0;
//     }
// }

// Normal approach 2
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         return nums[n/2];
//     }
// }