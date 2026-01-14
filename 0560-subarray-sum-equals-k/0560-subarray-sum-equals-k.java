class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int  i=0;i<n;i++){
           int j=i;
           int sum=0;
           while(j<n){
            sum=sum+nums[j];
            if(sum==k){
                count++;
            }
            j++;
        }
    }
        return count;
    } 
}