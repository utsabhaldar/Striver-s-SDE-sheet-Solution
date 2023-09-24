// Striver's SDE Sheet - Linked List & Arrays - Leetcode Q42 - Java

// 42. Trapping Rain Water

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// Example 1:
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:
// Input: height = [4,2,0,3,2,5]
// Output: 9
// Constraints:
// n == height.length
// 1 <= n <= 2 * 104
// 0 <= height[i] <= 105



// Time:O(n)
// Space:O(1)
public class leetcode_42_trap_rain_water {
    public int trap(int[] h) {
        int l = 0, r = h.length-1, ans = 0, maxLeft = 0, maxRight = 0;
        while(l < r){
            if(h[l] <= h[r]){
                if(h[l] >= maxLeft) maxLeft = h[l];
                else ans += maxLeft - h[l];
                l++;
            } else{
                if(h[r] >= maxRight) maxRight = h[r];
                else ans += maxRight - h[r];
                r--;
            }
        }
        return ans;
    }
}
