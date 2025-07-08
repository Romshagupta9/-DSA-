class Solution {
    public int lengthOfLongestSubstring(String s) {
        //solving it using hashset to avoid duplicacy
        //in hashset,order doesn't matters .....
        HashSet<Character> hs= new HashSet<>();
        int l=0,r=0,maxlen=0;
        while(r<s.length()){
            char ch=s.charAt(r);
          if(!hs.contains(ch)){
            hs.add(ch);
            maxlen=Math.max(r-l+1,maxlen);
            r++;
          }
          else{
             hs.remove(s.charAt(l));
             l++;
          }
        }
        return maxlen;
    }
}