class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] na=new int[2];
        int i=0,j=numbers.length-1;
          while(i<numbers.length && j>=0 && i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                na[0]=i+1;
                na[1]=j+1;
                return na;
            }
            else{
                if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }
          }   
        return na;
    }
}