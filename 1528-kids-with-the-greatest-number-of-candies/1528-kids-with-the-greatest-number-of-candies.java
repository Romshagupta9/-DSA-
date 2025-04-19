class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> result=new ArrayList<>();
        int mx=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>mx){
               mx=candies[i];
            }
        }
         for(int i=0;i<candies.length;i++){
            if (candies[i]+ extraCandies >= mx) {
                       result.add(true);
                       } 
            else {
                             result.add(false);
            }               
        }
        return result;
}
}