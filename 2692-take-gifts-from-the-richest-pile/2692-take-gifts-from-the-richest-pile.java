class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i : gifts){
            pq.add(i);
        }
        for(int i=0;i<k ;i++){
            int x=pq.poll();
            pq.add((int)Math.sqrt(x));
        }
        //int sum=0;
        long sum=0;
        for(int i : pq){
            sum+=i;
        }
        return sum;
    }
}