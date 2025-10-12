class Solution {
    public void helper(int[] candidates, int target,List<List<Integer>> ls,List<Integer> curr,int i){
        if(target==0){
            ls.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int j=i;j<candidates.length;j++){
        if(j>i && candidates[j]==candidates[j-1]){
            continue;
        }
        if(candidates[j]>target){
            break;
        }
        curr.add(candidates[j]);
        helper(candidates,target-candidates[j],ls,curr,j+1);
        curr.remove(curr.size()-1);
       }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates,target,ls,curr,0);
        return ls;
    }
}