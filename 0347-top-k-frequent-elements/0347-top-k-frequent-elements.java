import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>>ls=new ArrayList<>(hm.entrySet());
        ls.sort((a,b)->b.getValue()-a.getValue());
       for(int i=0;i<k;i++){
            arr[i]=ls.get(i).getKey();
       }
        return arr;
    }
}