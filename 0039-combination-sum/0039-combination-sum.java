class Solution {
    public void helper(int[] candidates, int target,int i,List<List<Integer>> ls,List<Integer> curr){
        if(target==0){
            ls.add(new ArrayList<>(curr));
            return;
        }
        if(i==candidates.length || target<0){
            return;
        }
        curr.add(candidates[i]);
        helper(candidates,target-candidates[i],i,ls,curr);
        curr.remove(curr.size()-1);
        helper(candidates,target,i+1,ls,curr);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls= new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates,target,0,ls,curr);
        return ls;
    }
}