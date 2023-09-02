// Striver's SDE Sheet - Array3 - Leetcode Q74 - Java

// 74. Search a 2D Matrix

// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
// Example 2:

// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false
 
// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 100
// -104 <= matrix[i][j], target <= 104




// Time complexity: O(log(n*m))
// Space complexity: O(1)
public class leetcode_74_search_in_a_2d_matrix {
    public boolean searchMatrix(int[][] mat, int target) {
        int r=mat.length;
        int c = mat[0].length;
        int low = 0, high = (r*c)-1;

        while(low<high){
            int mid = (low + high)>>1;
            if(mat[mid/c][mid%c] < target) low = mid+1;
            else high = mid;
        }
        return mat[high/c][high%c]==target;
    }
}
