class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double maxsum=sum;
        for(int i=k;i<n;i++){
            sum=sum+nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum/k;
    }
}