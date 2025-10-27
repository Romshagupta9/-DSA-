class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        helper(res,ls,candidates,target,0);
        return res;
    }
    private void helper(List<List<Integer>> res,List<Integer> ls
    ,int[] candidates, int target,int i){
        if(target<0 || i==candidates.length){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(candidates[i]);
        helper(res,ls,candidates,target-candidates[i],i);
        ls.remove(ls.size()-1);
        helper(res,ls,candidates,target,i+1);
    }
}