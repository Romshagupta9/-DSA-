class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref=strs[0];
        int pref_len=pref.length();
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            while(pref_len>s.length() || !pref.equals(s.substring(0,pref_len))){
                pref_len--;
                if(pref_len==0){
                    return "";
                }
                pref=pref.substring(0,pref_len);
            }
        }
        return pref;
    }
}