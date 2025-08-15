class Solution {
    public boolean isPowerOfFour(int n) {
        int i=0;
        double k=0;
        while(k<=n){
            k=Math.pow(4,i);
            if(k==n){
                return true;
            }
            i++;
        }
        return false;
    }
}