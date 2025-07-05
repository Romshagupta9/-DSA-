class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int lucky=-1;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key)==key){
                lucky=key;
            }
        }
        return lucky;
    }
}