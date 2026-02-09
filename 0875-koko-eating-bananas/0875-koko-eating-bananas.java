class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int i=0;i<piles.length;i++){
            r=Math.max(r,piles[i]);
        } 
        // one test case will not pass with this
        while(l<=r){
            int m=l+((r-l)/2);
            if(helper(piles,m,h)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
    public boolean helper(int[] piles,int m, int h){
        long hr=0;
        for(int i:piles){
            int div=i/m;
            hr+=div;
            if(i%m!=0){
                hr++;
            }
        }
        return hr<=h;
    }
}