class Solution {
    public boolean isHappy(int n) {
        Set <Integer> hs = new HashSet<>();
        while(n!=1){
             if(hs.contains(n)){
                return false;
             }
             hs.add(n);
             n=helper(n);
        }
        return true;
    }
    private int helper(int num){
            int sum=0;
            while(num>0){
               int digit=num%10;
               sum+=digit*digit;
               num=num/10;
            }
            return sum;
    }
}

