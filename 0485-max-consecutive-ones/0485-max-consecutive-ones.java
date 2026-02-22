class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //sliding window
        int i=0,j=0,maxlen=0,n=nums.length;
        while(j<n){
            if(nums[j]==1){
                maxlen=Math.max(j-i+1,maxlen);
            }
            else{
                i=j+1;
            }
            j++;
        }
        return maxlen;
    }
}