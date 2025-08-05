class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>  hm= new HashMap<>();
        for(int i: nums1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int [] arr= new int[1001];
        int index=0;
        for(int i: nums2){
            if(hm.containsKey(i) && hm.get(i)>0){
               
                    arr[index++]=i;
                    hm.put(i, hm.get(i) - 1);
                
            }
        }
       return Arrays.copyOf(arr, index);

    }
}