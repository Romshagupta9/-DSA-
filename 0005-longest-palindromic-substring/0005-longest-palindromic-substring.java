class Solution {
    public String longestPalindrome(String s) {
         String max_str=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String odd=ok(s,i,i);//for odd paindrome
            String even=ok(s,i,i+1);//for even 
            if(odd.length()>max_str.length()){
                max_str=odd;
            }
            if(even.length()>max_str.length()){
                max_str=even;
            }
        }
         return max_str;
    }
    public String ok(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}