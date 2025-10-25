class Solution {
    public int totalMoney(int n) {
        int sum=0,count=1,c=2;
        for(int i=1;i<=n;i++){
            sum=sum+count;
            count++;
            if(i%7==0){
                count=c;
                c++;
            }
        }
        return sum;
    }
}