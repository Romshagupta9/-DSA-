class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int n=nums.length;
        // int l=0,h=n-1;
        // if(nums[l]!=nums[l+1]){
        //     return nums[l];
        // }
        // if(nums[h]!=nums[h-1]){
        //     return nums[h];
        // }
        // while(l<=h){
        //     int m=(l+h)/2;
        //     if(nums[m+1]!=nums[m]){
        //         l=m+1;
        //     }
        //     else{
        //         h=m-1;
        //     }
        // }
        int result=0;
        for(int i:nums){
            result^=i;
        }
        return result;
    }
}