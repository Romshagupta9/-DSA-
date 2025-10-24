class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        helper(res,n,k,1,ls);
        return res;
    }
    private void helper(List<List<Integer>> res,int n,int k,
    int start,List<Integer> ls){
        if(ls.size()==k){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int i=start;i<=n;i++){
            ls.add(i);
            helper(res,n,k,i+1,ls);
            ls.remove(ls.size()-1);
        }
    }
}