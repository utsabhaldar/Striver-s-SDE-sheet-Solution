// Striver's SDE Sheet - Binary Search implementation - leetcode 704 - C++, Java

// C++
// Time: O(log N base 2)
int bs(vector<int>& nums, int target, int low, int high){
    if(low>high) return -1;
    int mid = low + (high - low)/2;
    if(nums[mid] == target) return mid;
    else if(target > nums[mid]) return bs(nums, target, mid+1, high);
    return bs(nums, target, low, mid-1);
}

int search(vector<int> &nums, int target) {

    return bs(nums, target, 0, nums.size()-1);

}

// Java
class Solution {
    static int bs(int[] nums, int target, int low, int high){
    if(low>high) return -1;
    int mid = low + (high - low)/2;
    if(nums[mid] == target) return mid;
    else if(target > nums[mid]) return bs(nums, target, mid+1, high);
    return bs(nums, target, low, mid-1);
    }
    
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }
}