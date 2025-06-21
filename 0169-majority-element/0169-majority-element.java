class Solution {
    public int majorityElement(int[] nums) {
        // int max=0,index=0;
        // int [] count=new int[10001];
        // for(int i=0;i<nums.length;i++){
        //     count[nums[i]]++;
        // }
        // for(int i=0;i<count.length;i++){
        //     if(count[i]>=max){
        //         max=count[i];
        //         index=i;
        //     }
        // }
        // return index;


       int count=0;
       int vip=0;
       for(int i=0;i<nums.length;i++){
        if(count==0){
            vip=nums[i];
        }
        if(nums[i]==vip){
           count++;
        }
        else{
            count--;
        }
       }
       return vip;

        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];
}
}
