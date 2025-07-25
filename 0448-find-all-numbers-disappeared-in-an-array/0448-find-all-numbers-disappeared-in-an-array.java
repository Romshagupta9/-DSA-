class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> hs=new HashSet<>();
        List<Integer> ls=new ArrayList<>();
        for(int i : nums){
            hs.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}