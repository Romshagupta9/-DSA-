class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map <Character,Integer> hs= new HashMap<>();
        for(Character s : magazine.toCharArray()){
              hs.put(s,hs.getOrDefault(s,0)+1);
        }
        for(Character s : ransomNote.toCharArray()){
              if(!hs.containsKey(s) || hs.get(s)==0){
                 return false;
              }
              else{
                hs.put(s,hs.get(s)-1);
              }
        }
        return true;
    }
}