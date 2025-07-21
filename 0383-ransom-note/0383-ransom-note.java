class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> hm=new HashMap<>();
        for(Character c : magazine.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(Character c : ransomNote.toCharArray()){
            if(!hm.containsKey(c) || hm.get(c)==0){
                  return false;
            }
            else{
                hm.put(c,hm.get(c)-1);
            }
        }
        return true;
    }
}