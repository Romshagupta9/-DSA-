class Solution {
    public int totalMoney(int n) {
        int sum=0,i=1;
        while(n>0){
            int j=i;
            while(j<i+7 && n>0){
               sum=sum+j;
               j++;
               n--;
        }
        i++;
    }
    return sum;
    } 
} 