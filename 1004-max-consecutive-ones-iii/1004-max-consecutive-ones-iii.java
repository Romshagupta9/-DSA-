class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,n=nums.length,maxlen=0,c=0;
        while(j<n){
           if(nums[j]==0){
            c++;
           }
           while(c>k){
                if(nums[i]==0){
                    c--;
                }
                i++;
           }
           maxlen=Math.max(j-i+1,maxlen);
           j++;
        }
        return maxlen;
    }
}