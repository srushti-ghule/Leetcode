class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;

        for(int num : nums){
            if(num == 0){
                return 0;
            }
            if (num < 0){
                sign *= -1;
            }

        }
        return sign;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna