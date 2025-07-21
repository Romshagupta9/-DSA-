class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //making 2 hashsets and then two arraylists
        Set <Integer> h1=new HashSet<>();
        Set <Integer> h2=new HashSet<>();
        List <Integer> l1=new ArrayList<>();
        List <Integer> l2=new ArrayList<>();
        for(int num : nums1){
            h1.add(num);
        }
        for(int num : nums2){
            h2.add(num);
        }
        for( int num : h1){
            if(!h2.contains(num)){
                l1.add(num);
            }
        }
        for( int num : h2){
            if(!h1.contains(num)){
                l2.add(num);
            }
        }
        return Arrays.asList(l1,l2);
    }
}