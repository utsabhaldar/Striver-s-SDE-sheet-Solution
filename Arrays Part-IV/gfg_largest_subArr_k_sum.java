// Striver's SDE Sheet - Array4 - GFG - Largest subarray with 0 sum - Java

// Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
// Example 1:
// Input:
// N = 8
// A[] = {15,-2,2,-8,1,7,10,23}
// Output: 5
// Explanation: The largest subarray with
// sum 0 will be -2 2 -8 1 7.
// Your Task:
// You just have to complete the function maxLen() which takes two arguments an array A and n, 
// where n is the size of the array A and returns the length of the largest subarray with 0 sum.
// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(N).
// Constraints:
// 1 <= N <= 105
// -1000 <= A[i] <= 1000, for each valid i



// Time:O(n)
// Space:O(n)
import java.util.HashMap;

public class gfg_largest_subArr_k_sum {
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int sum = 0, max = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == 0) max = i+1;
            else{
                if(mp.get(sum) != null) max = Math.max(max, i-mp.get(sum));
                else mp.put(sum, i);
            }
        }
        return max;
    }
}
