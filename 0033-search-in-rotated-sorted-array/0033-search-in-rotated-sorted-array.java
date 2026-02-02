class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[l]<=nums[m]){
                if(nums[l]<=target && nums[m]>=target){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(nums[m]<=target && nums[h]>=target){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return -1;
    }
}