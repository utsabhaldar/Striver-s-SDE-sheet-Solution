// Striver's SDE Sheet - Array4 - Leetcode Q128 - Java

// 128. Longest Consecutive Sequence

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

// Example 1:
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:
// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
 
// Constraints:
// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109




// Time Complexity: O(N) + O(2*N) ~ O(3*N)
// Space Complexity: O(N)
import java.util.HashSet;
import java.util.Set;
public class leetcode_128_longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int ans = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        for(int i: set){
            if(!set.contains(i-1)){
                int cnt = 1;
                int x = i;
                while(set.contains(x+1)){
                    x+=1;
                    cnt+=1;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}
