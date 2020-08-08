class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int max_diff=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(prices[j]-prices[i]>max_diff)
                    max_diff=prices[j]-prices[i];
            }
        }
        return max_diff;
    }
}
