// Striver's SDE Sheet - Greedy Algorithms - GFG - Minimum number of coins - Java

// Given an infinite supply of each denomination of Indian currency { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } and a target value N.
// Find the minimum number of coins and/or notes needed to make the change for Rs N. You must return the list containing the value of coins required. 
// Example 1:
// Input: N = 43
// Output: 20 20 2 1
// Explaination: 
// Minimum number of coins and notes needed to make 43. 
// Your Task: You do not need to read input or print anything. Your task is to complete the function minPartition() 
// which takes the value N as input parameter and returns a list of integers in decreasing order.
// Constraints:
// 1 ≤ N ≤ 106



// Time:O(n)
// Space:O(1)
import java.util.ArrayList;
import java.util.List;

public class gfg_minimum_num_of_coins {
    static List<Integer> minPartition(int n)
    {
        int[] coins={2000,500,200,100,50,20,10,5,2,1};
        List<Integer> ans = new ArrayList<>();
        int i=0;

        while(n>0){
            if(coins[i]<=n){
                ans.add(coins[i]);
                n-=coins[i];
            }
            else{
                i++;
            }
        }
        
        return ans;
        
    }
}
