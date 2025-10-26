class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List <Integer> ls=new ArrayList<>();
        boolean [] used=new boolean[nums.length];
        helper(nums,res,ls,used);
        return res;
    } 
    private void helper(int[] nums,List<List<Integer>> res,List <Integer> ls,boolean [] used){
        if(ls.size()==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=0;i<nums.length;i++){
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
