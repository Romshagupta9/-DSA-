class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        StringBuffer sb=new StringBuffer(s);
        int i=0,j=0;
        int m=word1.length();
        int n=word2.length();
        while(i<m && j<n){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<m){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<n){
            sb.append(word2.charAt(j));
            j++;
        }
        s=sb.toString();
        return s;
     }
}
