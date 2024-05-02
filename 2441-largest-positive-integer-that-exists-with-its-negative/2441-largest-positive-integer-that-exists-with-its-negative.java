class Solution {
    public int findMaxK(int[] nums) {
        // Sort the input array in ascending order
        Arrays.sort(nums);

        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            
            // If the negation of the element at lo is equal to the element at hi
            if (-nums[lo] == nums[hi]) {
                return nums[hi];
            }

            // If the negation of element at lo is greater than element at hi
            else if (-nums[lo] > nums[hi]) { 
                ++lo;
            } 
            
            // If the negation of element at lo is smaller than element at hi
            else {
                --hi; 
            }
        }
        return -1;
    }
}