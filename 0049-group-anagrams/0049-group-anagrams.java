class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String key=new String(arr);
        if(!hm.containsKey(key)){
            hm.put(key,new ArrayList<>());
        }
        hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}