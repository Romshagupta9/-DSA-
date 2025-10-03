class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> hs= new HashSet<>();
        for(int i: nums){
            hs.add(i);
        }

        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}