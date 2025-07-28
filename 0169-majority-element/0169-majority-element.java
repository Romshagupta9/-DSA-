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


    //    int count=0;
    //    int vip=0;
    //    for(int i=0;i<nums.length;i++){
    //     if(count==0){
    //         vip=nums[i];
    //     }
    //     if(nums[i]==vip){
    //        count++;
    //     }
    //     else{
    //         count--;
    //     }
    //    }
    //    return vip;


    // Arrays.sort(nums);
    // int n=nums.length;
    // return nums[n/2];


    HashMap<Integer,Integer> hm= new HashMap<>();
    for(int i:nums){
        hm.put(i,hm.getOrDefault(i,0)+1);
    }
    int max=0,majority=0;
    for(int i :hm.keySet()){
        if(hm.get(i)>majority){
            max=i;
            majority=hm.get(i);
        }
    }
    return max;
}
}
