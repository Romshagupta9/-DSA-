class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0,i=1;
        while(i<nums.length){
             if(nums[j]==nums[i]){
                i++;
             }
             else{
                j++;
                nums[j]=nums[i];
             }
        }
        return j+1;
    }
}