class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s="";
        int i=0;
        int len=strs.length;
        while(i<strs[0].length()){
            if(strs[0].charAt(i)==strs[len-1].charAt(i)){
                s+=strs[0].charAt(i);
            }
            else{
                break;
            }
            i++;
        }
        return s;
    }
}

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String pref=strs[0];
//         int pref_len=pref.length();
//         for(int i=1;i<strs.length;i++){
//             String s=strs[i];
//             while(pref_len>s.length() || !pref.equals(s.substring(0,pref_len))){
//                 pref_len--;
//                 if(pref_len==0){
//                     return "";
//                 }
//                 pref=pref.substring(0,pref_len);
//             }
//         }
//         return pref;
//     }
// }