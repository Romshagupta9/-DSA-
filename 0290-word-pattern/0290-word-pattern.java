class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] arr1=pattern.toCharArray();
        String[] arr2=s.split(" ");
        if(arr1.length!=arr2.length){
            return false;
        }
        Map<Character,Integer> hm1= new HashMap<>();
        Map<String,Integer> hm2= new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            if(!hm1.containsKey(arr1[i])){
                hm1.put(arr1[i],i);
            }
            if(!hm2.containsKey(arr2[i])){
                hm2.put(arr2[i],i);
            }
            if(!hm1.get(arr1[i]).equals(hm2.get(arr2[i]))){
                return false;
            }
        }
        return true;
    }
}