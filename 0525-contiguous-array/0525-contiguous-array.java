class Solution {
    public int findMaxLength(int[] nums) {
         int maxLength = 0;
         int count = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1); // Initial count of 0 is -1 since it acts as a starting point
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            
            if (countMap.containsKey(count)) { // If the count has been seen before, update maxLength
                maxLength = Math.max(maxLength, i - countMap.get(count));
            } else { // If count is seen for the first time, store its index
                countMap.put(count, i);
            }
        }
        
        return maxLength;
    }
}