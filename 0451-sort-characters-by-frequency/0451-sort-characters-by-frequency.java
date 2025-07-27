class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm= new HashMap<>();
        StringBuilder res= new StringBuilder();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(
    (a, b) -> hm.get(b) - hm.get(a)
);

        pq.addAll(hm.keySet());

        while(!pq.isEmpty()){
            char ch=pq.poll();
            int freq=hm.get(ch);
            for(int i=0;i<freq;i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}