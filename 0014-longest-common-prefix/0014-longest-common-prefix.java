class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If array is empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as prefix
        String prefix = strs[0];

        // Compare prefix with remaining strings
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Remove last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna