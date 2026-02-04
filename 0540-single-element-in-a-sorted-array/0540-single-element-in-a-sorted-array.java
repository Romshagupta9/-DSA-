class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<h){
            int m=(l+h)/2;
            if(m%2==1){
                m--;
            }
            if(nums[m]==nums[m+1]){
                l=m+2;
            }
            else{
                h=m;
            }
        }
        return nums[l];


        // int result=0;
        // for(int i:nums){
        //     result^=i;
        // }
        // return result;
    }
}