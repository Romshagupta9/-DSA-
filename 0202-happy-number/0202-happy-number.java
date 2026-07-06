class Solution {
    public boolean isHappy(int n) {
        Set<Integer>hs=new HashSet<>();
        while(n!=1){
            if(hs.contains(n)){
                return false;
            }
            hs.add(n);
            n=helper(n);
        }
        return true;
    }
    public int helper(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=(digit*digit);
            n=n/10;
        }
        return sum;
    }
}