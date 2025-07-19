class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length,pivot=0;
        int [] ls= new int[n];
        int [] rs=new int [n];
        ls[0]=0;rs[n-1]=0;
        for(int i=1;i<n;i++){
            ls[i]=ls[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rs[i]=rs[i+1]+nums[i+1];
        }
        int j=0,k=0;
        while(j<ls.length && k<rs.length){
            if(ls[j]==rs[k]){
                return j;
            }
            j++;
            k++;
        }
        return -1;
    }
}