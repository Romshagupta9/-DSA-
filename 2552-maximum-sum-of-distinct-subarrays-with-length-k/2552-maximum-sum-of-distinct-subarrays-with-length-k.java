class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         int l=0;
         long sum=0,maxsum=0;
         Set<Integer> hs=new HashSet<>();
         for(int r=0;r<nums.length;r++){
            while(hs.contains(nums[r])){
                sum=sum-nums[l];
                hs.remove(nums[l]);
                l++; 
            }
            hs.add(nums[r]);
            sum=sum+nums[r];
            if(r-l+1==k){
                maxsum = Math.max(maxsum, sum);
                sum=sum-nums[l];
                hs.remove(nums[l]);
                l++;
            }
         }
        return maxsum;
    }    
}