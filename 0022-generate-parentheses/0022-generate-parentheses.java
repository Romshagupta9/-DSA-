class Solution {
    public void generate(List<String> ls,int n,int ob,int cb,String s){
        if(ob==n && cb==n){
            ls.add(s);
            return;
        }
        if(ob<n){
            generate(ls,n,ob+1,cb,s+"(");
        }
        if(cb<ob){
            generate(ls,n,ob,cb+1,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<>();
        generate(ls,n,0,0,"");
        return ls;
    }  
}