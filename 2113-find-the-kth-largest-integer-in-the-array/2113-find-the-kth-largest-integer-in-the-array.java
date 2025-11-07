// import java.math.*;
// class Solution {
//     public String kthLargestNumber(String[] nums, int k) {
//         PriorityQueue <BigInteger> pq=new PriorityQueue<>();
//         for(String i:nums){
//             pq.add(new BigInteger(i));
//             if(pq.size()>k){
//                 pq.poll();
//             }
//         }
//         return pq.peek().toString();
//     } 
// }

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
PriorityQueue<String> pq = new PriorityQueue<>(
    (a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length()
);
        for(String i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    } 
}
