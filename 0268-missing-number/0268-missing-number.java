class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected_sum = n*(n+1)/2;
        int actual_sum = 0;

        for(int num : nums){
            actual_sum += num;

        }
        return expected_sum - actual_sum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna