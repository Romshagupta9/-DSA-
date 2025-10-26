class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums,res,ls,used);
        return res;
    }
    private void helper(int[] nums,List<List<Integer>> res,List<Integer> ls
    ,boolean[] used){
        if(ls.size()==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && used[i-1]==false){
                continue;
            }
            if(used[i]==false){
                used[i]=true;
                ls.add(nums[i]);
                helper(nums,res,ls,used);
                ls.remove(ls.size()-1);
                used[i]=false;
            }
        }
    }
}