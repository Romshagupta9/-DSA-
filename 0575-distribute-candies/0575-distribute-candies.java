class Solution {
    public int distributeCandies(int[] candyType) {
        Set <Integer> s= new HashSet<>();
         int n=candyType.length;
        for(int i : candyType){
            s.add(i);
        }
        return Math.min(n/2,s.size());
    }
}