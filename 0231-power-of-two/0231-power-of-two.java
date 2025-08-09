class Solution {
    public boolean isPowerOfTwo(int n) {
        // for(int x=0;x<=n;x++){
        //     double k=Math.pow(2,x);
        //     if(k==n){
        //         return true;
        //     }
        // }
        // return false;
        int x=0;
        while(Math.pow(2,x)<=n){
            double k=Math.pow(2,x);
            if(k==n){
                return true;
            }
            x++;
        }
        return false;
    } 
} 
