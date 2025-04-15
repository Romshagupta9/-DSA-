class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int maxprofit=0;
       int mini=prices[0];
       int cost=0;
       for(int i=0;i<n;i++){
        cost=prices[i]-mini;
        maxprofit=Math.max(cost,maxprofit);
        mini=Math.min(prices[i],mini)
       }
       return maxprofit;
    }
}

