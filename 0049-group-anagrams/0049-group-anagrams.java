class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ls=new HashMap<>();
        for(String s:strs){
            char[]arr=s.toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);
            if(!ls.containsKey(key)){
                ls.put(key,new ArrayList<>());
            }
            ls.get(key).add(s);
        } 
        return new ArrayList<>(ls.values());
    } 
}