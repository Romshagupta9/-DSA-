class Solution {
    public boolean isPowerOfThree(int n) {
        int x=0;
        while(Math.pow(3,x)<=n){
            double k=Math.pow(3,x);
            if(k==n){
                return true;
            }
            x++;
        }
        return false;
    } 
}

