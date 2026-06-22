class Solution {
    public int maxProfit(int[] prices) {
        
        int MinPrice = Integer.MAX_VALUE;//it gets max value in array
        int MaxProfit = 0;
        for(int price:prices){//checks price in array prices

            if(price < MinPrice){
                MinPrice = price;
            } else {
                int Profit = price - MinPrice;//calculate profit 
                

               if(Profit > MaxProfit) {
                MaxProfit = Profit;
                  }
               }

        }
         return MaxProfit;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna