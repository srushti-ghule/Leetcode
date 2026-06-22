/*Problem: Reverse Integer

Method:
- Mathematical Digit Manipulation
- Reverse Number Algorithm

Concepts:
- % 10 (extract last digit)
- / 10 (remove last digit)
- while loop
- Integer overflow check
- Edge case handling

Time Complexity: O(log10 n)
Space Complexity: O(1)  */

class Solution {
    public int reverse(int x) {
        
        int rev=0;
        while(x!=0){
           int digit = x % 10;

         // Check for overflow before updating rev 
           if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit >7)){
            return 0;

           }

           if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit <-8)){
            return 0;

           }

           rev = rev*10+digit;
           x = x / 10;

        }
        return rev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna