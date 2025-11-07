import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue <BigInteger> pq=new PriorityQueue<>();
        for(String i:nums){
            pq.add(new BigInteger(i));
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek().toString();
    } 
}
