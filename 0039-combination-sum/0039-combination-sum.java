class Solution {
    public void helper(int[] candidates,int target,List <List<Integer>> ls,List<Integer> curr,int i){
        if(target==0){
            ls.add(new ArrayList<>(curr));
            return;
        }
        if(i==candidates.length || target<0){
            return;
        }
        curr.add(candidates[i]);
        helper(candidates,target-candidates[i],ls,curr,i);
        curr.remove(curr.size()-1);
        helper(candidates,target,ls,curr,i+1);
    } 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List <List<Integer>> ls= new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates, target, ls, curr, 0);
        return ls;
    }
}