// Striver's SDE Sheet - Array1 - Leetcode Q31 - C++, Java

// 31. Next Permutation

// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]
// Example 2:

// Input: nums = [3,2,1]
// Output: [1,2,3]
// Example 3:

// Input: nums = [1,1,5]
// Output: [1,5,1]
 

// Constraints:

// 1 <= nums.length <= 100
// 0 <= nums[i] <= 100




// cpp
// Time: O(n)
// Space: O(1)
class Solution {
   public:
   void nextPermutation (vector<int>& a) {
       int max_right = -1;
        for(int i=a.size()-1; i>=1; i--) {
         max_right=max(max_right, a[i]);
         if(a[i-1]<max_right){
            reverse(a.begin()+i, a.end());
            int ele = upper_bound(a.begin()+i, a.end(),a[i-1])-a.begin();
            swap(a[ele],a[i-1]);
            return;
            }
        }
      reverse(a.begin(), a.end());
      }
   };



// Java
// Time: O(3n)
// Space: O(1)
public class leetcode_31_next_permutation {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            rev(nums, 0, nums.length-1);
        }
        else{
            for(int i=nums.length-1; i>index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        rev(nums, index+1, nums.length-1);
        }
        
    }

    public void rev(int[] nums, int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;e--;
        }
    }
}
