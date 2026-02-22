class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,maxlen=0;
        int n=s.length();
        Set<Character>hs=new HashSet<>();
        while(j<n){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                maxlen=Math.max(maxlen,j-i+1);
                j++;
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return maxlen;
    }
}