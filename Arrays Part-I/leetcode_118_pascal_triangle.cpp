// Striver's SDE Sheet - Array1 - Leetcode Q118 - C++, Java

// 118. Pascal's Triangle

// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
 

// Constraints:

// 1 <= numRows <= 30



class Solution{
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> r(numRows);
        for(int i=0;i<numRows;i++){
            r[i].resize(i + 1);
            r[i][0]=1;
            r[i][i]=1;
            for(int j=1;j<i;j++){
                r[i][j]=r[i-1][j-1]+r[i-1][j];
            }
        }
        return r;
    }    
}


// import java.util.ArrayList;
// import java.util.List;

// public class Q118_pascal_triangle {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> output = new ArrayList<List<Integer>>();
// 	    if (numRows <= 0)  return output;
// 	    ArrayList<Integer> prev = new ArrayList<Integer>();
// 	    prev.add(1);
// 	    output.add(prev);
// 	    for (int i = 2; i <= numRows; i++) {
// 		    ArrayList<Integer> curr = new ArrayList<Integer>();
// 		    curr.add(1);
// 		    for (int j = 0; j < prev.size() - 1; j++) {
// 			    curr.add(prev.get(j) + prev.get(j + 1));
// 		    }
// 		    curr.add(1);
// 		    output.add(curr);
// 		    prev = curr;
// 	    }
// 	    return output;
//     }
// }