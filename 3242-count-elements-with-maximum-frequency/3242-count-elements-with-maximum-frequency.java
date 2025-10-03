class Solution {
    //read the question carefully
    public int maxFrequencyElements(int[] nums) {
        Map <Integer,Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        } 
        int count=0,max=0;
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
