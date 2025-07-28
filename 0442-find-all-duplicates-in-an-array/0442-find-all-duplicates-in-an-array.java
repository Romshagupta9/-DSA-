class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i: hm.keySet()){
            if(hm.get(i)==2){
                ls.add(i);
            }
        }
        return ls;
    }
}