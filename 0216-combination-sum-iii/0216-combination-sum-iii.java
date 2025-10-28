class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        helper(res,ls,k,n,0,0);
        return res;
    } 
    private void helper(List<List<Integer>> res,List<Integer> ls,int k,int n
    ,int sum,int i){
        if(ls.size()==k && sum==n){
            res.add(new ArrayList<>(ls));
            return;
        }
        for(int j=i+1;j<=9;j++){
            ls.add(j);
            sum=sum+j;
            helper(res,ls,k,n,sum,j);
            ls.remove(ls.size()-1);
            sum=sum-j;
        }
    }
}