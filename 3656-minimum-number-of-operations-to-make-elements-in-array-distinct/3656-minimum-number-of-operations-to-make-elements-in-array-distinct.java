class Solution {
    public int minimumOperations(int[] nums) {
           int count=0;
           int len=nums.length;
          if (len < 3) {
              if (len == 2 && nums[0] == nums[1]) return 1;
              return 0;
}
        for(int i=0;i<len;i++){
          for(int j=i+1;j<len;j++){
            
            if(nums[i]==nums[j]){
              for(int k=0;k<len-3;k++){
                nums[k]=nums[k+3];
              }
              len -= 3;
             count++;
              i = -1;
              break;
             }
             
        }
    }
    return count;
}
}