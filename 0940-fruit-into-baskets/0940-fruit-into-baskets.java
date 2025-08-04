class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> d=new HashMap<>();
        int l=0,n=fruits.length,ans=0;
        for (int r=0;r<n;r++){
            d.put(fruits[r],d.getOrDefault(fruits[r],0)+1);
            while (d.size()>2 && l<=r){
                d.put(fruits[l],d.get(fruits[l])-1);
                if (d.get(fruits[l])==0) d.remove(fruits[l]);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}