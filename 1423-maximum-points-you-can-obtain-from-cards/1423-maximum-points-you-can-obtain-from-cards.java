class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0,n=cardPoints.length,threesum=0;
        int sum=0;
        for(int l=0;l<n;l++){
            sum+=cardPoints[l];
        }
        int window_size=n-k;
        int res=Integer.MAX_VALUE;
        while(i<=n-window_size){ 
            int j=i;
            int count=0;
            while(j<n && count < window_size){
            threesum+=cardPoints[j];
            j++;
            count++;
        }
        res=Math.min(res,threesum);
        threesum=0;
        i++;
      }
       return sum-res;
    }
}