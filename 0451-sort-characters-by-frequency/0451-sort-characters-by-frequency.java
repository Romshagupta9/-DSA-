class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>hm=new HashMap<>();
        char[]arr=s.toCharArray();
        String res="";
        for(char ch:arr){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        //character frequency k hisab se pq bnayege
PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        while(pq.size()>0){
            char ch=pq.poll();
            int freq=hm.get(ch);
            for(int i=0;i<freq;i++){
                res+=ch;
            }
        }
        return res;
    }
}