class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //using hasmap: key-number and value-occurances of that number.
        Map<Integer,Integer> hm=new HashMap<>();
        for(int num : arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Set<Integer> hs=new HashSet<>();
        for(int num : hm.values()){
            if(!hs.add(num)){
                return false;
            }
        }
        return true;
    }
}