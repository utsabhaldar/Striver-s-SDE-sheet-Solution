// Striver's SDE Sheet - Array2 - Leetcode Q48 - C++ , Java

// 56. Merge Intervals

// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

// Constraints:

// 1 <= intervals.length <= 104
// intervals[i].length == 2
// 0 <= starti <= endi <= 104





// C++ Optimal Solution
// Time Complexity: O(N*logN) + O(N)
// Space Complexity: O(N)
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n = intervals.size();
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> ans;
        for(int i=0; i<n; i++){
            if(ans.empty() || intervals[i][0] > ans.back()[1]){
                ans.push_back(intervals[i]);
            }else{
                ans.back()[1] = max (ans.back()[1], intervals[i][1]);
            }
        }
        return ans;
    }
};

// Java Optimal Solution
// Time Complexity: O(N*logN) + O(N)
// Space Complexity: O(N)
public class Q56_merge_intervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();

        for(int[] i : intervals){
            if(ans.isEmpty() || i[0] > ans.get(ans.size()-1)[1]) ans.add(i);
            else ans.get(ans.size()-1)[1] = Math.max(i[1], ans.get(ans.size()-1)[1]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}