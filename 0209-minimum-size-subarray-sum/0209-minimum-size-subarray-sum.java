class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int start=0,sum=0,minlen=Integer.MAX_VALUE;
         for(int end=0;end<nums.length;end++){
            sum=sum+nums[end];
         
         while(sum>=target){
            minlen=Math.min(minlen,end-start+1);
            sum=sum-nums[start];
            start++;
         }
        }
         return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }
}
