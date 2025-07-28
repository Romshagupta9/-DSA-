class Solution {
    public String frequencySort(String s) {
      Map<Character,Integer> hm= new HashMap<>();
      StringBuilder res=new StringBuilder();

      //counting frequencies
      for(char c: s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
      }

      //making a priority Queue
      PriorityQueue<Character> pq= new PriorityQueue<>(
        (a,b) -> hm.get(b)-hm.get(a)
        );
        pq.addAll(hm.keySet());
        while(pq.size()>=1){
            char ch=pq.poll();
            int freq=hm.get(ch);
            for(int i=0;i<freq;i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}