class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i: hm.keySet()){
            if(hm.get(i)>=2){
                return true;
            }
        }
        return false;
    }
}