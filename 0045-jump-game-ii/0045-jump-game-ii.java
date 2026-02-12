class Solution {
    public int jump(int[] nums) {
        int near=0,far=0,maxjumps=0;
        int n=nums.length-1;
        while(far<n){
            int farthest=0;
            for(int i=near;i<=far;i++){
                farthest=Math.max(farthest,nums[i]+i);
            }
            near=far+1;
            far=farthest;
            maxjumps++;
        }
        return maxjumps;
    }
}