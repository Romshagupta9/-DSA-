class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>ls=new ArrayList<>();
        ls.add(words[0]);
        for(int i=1;i<words.length;i++){
            char [] a=words[i].toCharArray();
            char[]  b=ls.get(ls.size()-1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(!Arrays.equals(a,b)){
                ls.add(words[i]);
            }
        }
        return ls;
    }
}