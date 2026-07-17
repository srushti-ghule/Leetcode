class Solution {
    public void duplicateZeros(int[] arr) {

        int zeros = 0;

        // Count zeros
        for (int num : arr) {
            if (num == 0) {
                zeros++;
            }
        }

        int i = arr.length - 1;
        int j = arr.length + zeros - 1;

        // Traverse from right to left
        while (i >= 0) {

            if (j < arr.length) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;

                if (j < arr.length) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna