public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        
        // 2. Calculate what the sum ACTUALLY is inside the array
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum+=nums[i];
        }
        return expectedSum-actualSum;
    }
}