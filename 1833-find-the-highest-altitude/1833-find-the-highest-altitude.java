class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int [] alt= new int[n+1];
        int max=0;
        alt[0]=0;
        for(int i=1;i<=n;i++){
            alt[i]=alt[i-1]+ gain[i-1];
        }
        for(int j=0;j<alt.length;j++){
            if(alt[j]>=max){
                max=alt[j];
            }
        }
        return max;
    }
}