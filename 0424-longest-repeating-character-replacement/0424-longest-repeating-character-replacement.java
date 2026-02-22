class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> hm=new HashMap<>();
        int res=0,l=0,maxfreq=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,hm.get(ch));
            while((r-l+1)-maxfreq>k){
                char left=s.charAt(l);
                hm.put(left,hm.get(left)-1);
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
} 