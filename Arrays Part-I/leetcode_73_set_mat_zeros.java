// Striver's SDE Sheet - Array1 - Leetcode Q73 - Java

// Set Matrix Zeroes
// Medium

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place

 
// Example 1:


// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
// Example 2:


// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 

// Constraints:

// m == matrix.length
// n == matrix[0].length
// 1 <= m, n <= 200
// -231 <= matrix[i][j] <= 231 - 1
 
// Follow up:

// A straightforward solution using O(mn) space is probably a bad idea.
// A simple improvement uses O(m + n) space, but still not the best solution.
// Could you devise a constant space solution?




class leetcode_73_set_mat_zeros {
   
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){  
                    matrix[i][0] = 0;
                if(j != 0){
                    matrix[0][j] = 0;
                }else col0 = 0;
                }
            }
        }
		
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 ||matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
                } 
            }
        }
        for(int i = 0;i<n;i++){
            if(matrix[0][0]==0){
                matrix[0][i] = 0;
            }
        }
        for(int i = 0;i<m;i++){
            if(col0 == 0){
                matrix[i][0]=0;
            }
        }
    }
}