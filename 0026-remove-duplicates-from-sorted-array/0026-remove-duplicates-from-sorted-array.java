class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,count=1,k=0,n=nums.length;
        while(i<n-1){
            int j=i+1;
                if(nums[i]!=nums[j]){
                    nums[++k]=nums[j];
                    count++;
                } 
                i++;
        }
        return count;
    }
}