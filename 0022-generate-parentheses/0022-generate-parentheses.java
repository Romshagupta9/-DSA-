class Solution {
    public void helper(int ob,int cb,String s,int n,List<String> ls){
        if(ob==n && cb==n){
            ls.add(s);
            return;
        }
        if(ob<n){
            helper(ob+1,cb,s+"(",n,ls);
        }
        if(cb<ob){
            helper(ob,cb+1,s+")",n,ls);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<>();
        helper(0,0,"",n,ls);
        return ls;
    }
}