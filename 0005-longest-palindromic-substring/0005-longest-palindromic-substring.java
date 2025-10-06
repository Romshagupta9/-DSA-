class Solution {
    public String longestPalindrome(String s) {
        String maxstr = s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String odd = ok(s,i,i);
            String even= ok(s,i,i+1);
            if(maxstr.length()<odd.length()){
                maxstr=odd;
            }
            if(maxstr.length()<even.length()){
                maxstr=even;
            }
        }
        return maxstr;
    }
    private String ok(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;  //expand 
            r++;
        }
        return s.substring(l+1,r);
    }
}