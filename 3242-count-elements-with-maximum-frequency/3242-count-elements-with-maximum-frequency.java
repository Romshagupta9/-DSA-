class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map <Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max=0,count=0;
        for(int i : hm.values()){
            if(i>max){
                max=i;
                count=i;
            }
            else if(i==max){
                count+=i;
            }
        }
        return count;
    }
}
