class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>hm=new HashMap<>();
        char[] arr=s.toCharArray();
        int ans=0;
        for(char ch:arr){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}