class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int max_diff=0;
        int min_price=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            if(prices[i]<min_price)
                min_price=prices[i];
            else if(prices[i]-min_price>max_diff)
                max_diff=prices[i]-min_price;
        }
        return max_diff;
    }
}
