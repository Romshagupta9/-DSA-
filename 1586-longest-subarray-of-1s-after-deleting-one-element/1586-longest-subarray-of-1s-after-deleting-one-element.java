class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,zc=0,maxlen=0;
        while(j<nums.length){
            if(nums[j]==0){
                zc++;
            }
            while(zc>1){
                if(nums[i]==0){
                    zc--;
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i);
            j++;
        }
        return  maxlen;
    }
}