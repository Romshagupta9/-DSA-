class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> hm1=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            char y=t.charAt(i);
            if(!hm1.containsKey(x)){ // preserving the first occurance of ith element in hm1
                hm1.put(x,i); 
            }
            if(!hm2.containsKey(y)){// preserving the first occurance of ith element in hm2
                hm2.put(y,i);
            }
            //Dono strings ke same position ke characters ka first index match hona chahiye.
            //Agar match nahi hota → iska matlab mapping ulta-pulta ho gaya → false return karo.

            if(hm1.get(x)!=hm2.get(y)){
                return false;
            }
        }
        return true;
    }
}