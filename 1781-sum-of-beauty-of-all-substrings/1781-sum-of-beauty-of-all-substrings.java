// Generate all substrings
// Track frequency of characters
// Find max frequency
// Find min frequency
// Add (max - min) to answer

class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[]freq=new int[26]; 
            //har ek substring k lie apni alg freq array banegi
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++){
                if(freq[k]>0){
                    max=Math.max(max,freq[k]);
                    min=Math.min(min,freq[k]);
                }
            }
             ans+=(max-min);
        }
    }
        return ans;
    }
}