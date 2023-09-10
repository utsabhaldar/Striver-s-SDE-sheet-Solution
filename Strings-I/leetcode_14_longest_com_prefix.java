// Striver's SDE Sheet - String 1 - Leetcode Q14 - Java

// 14. Longest Common Prefix

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 
// Constraints:
// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.



// Time:O(n)
// Space:O(1)
import java.util.Arrays;

public class leetcode_14_longest_com_prefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index = 0;

        while(index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }else{
                break;
            }
            
        }
        return index == 0?"": str1.substring(0,index);
    }

}