// Striver's SDE Sheet - Recursion - GFG -  Subset Sums - Java

// Given a list arr of N integers, return sums of all subsets in it.
// Example 1:
// Input:N = 2
// arr[] = {2, 3}
// Output:0 2 3 5
// Explanation:
// When no elements is taken then Sum = 0.
// When only 2 is taken then Sum = 2.
// When only 3 is taken then Sum = 3.
// When element 2 and 3 are taken then 
// Sum = 2+3 = 5.
// Constraints:
// 1 <= N <= 15
// 0 <= arr[i] <= 104



//Time:O(2^n + (2^n log(2^n)))
// Space:O(2^n)
import java.util.ArrayList;
import java.util.Collections;

public class gfg_subset_sums {
    void func(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> ans){
        if(ind==N){
            ans.add(sum);
            return;
        }
        
        func(ind+1, sum+arr.get(ind), arr, N, ans);
        func(ind+1, sum, arr, N, ans);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans = new ArrayList<>();
        
        func(0, 0, arr, N, ans);
        
        Collections.sort(ans);
        return ans;
    }
}
