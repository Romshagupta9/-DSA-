class Solution {
    public String longestPalindrome(String s) {
        //comparisons
        //odd : i+1 and i-1
        //even : i and i+1
        if(s.length()<=1){
            return s;
        }
        String maxstr=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String odd = ok(s,i,i);
            String even = ok(s,i,i+1);

            if(odd.length()>maxstr.length()){
                maxstr=odd;
            }
            if(even.length()>maxstr.length()){
                maxstr=even;
            }
        }
        return maxstr;
    }
    private String ok(String s,int l,int r){
        while(l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}