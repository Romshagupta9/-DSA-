class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int l=0,r=0,maxlen=0;
        // for(r=0;r<nums.length;r++){
        //    if(nums[r]==0){
        //       l++;
        //    }
        //    maxlen=Math.max(maxlen,r-l+1);
        // }
        // return maxlen;
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}