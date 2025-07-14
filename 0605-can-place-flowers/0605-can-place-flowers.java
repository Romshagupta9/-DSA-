class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count_zero=0,count_one=0;
        // for(int i=0;i<flowerbed.length;i++){
        //       if(flowerbed[i]==1){
        //         count_one++;
        //       }
        //      else if(flowerbed[i]==0){
        //         count_zero++;
        //       }
        // }
        // if(count_one%2 == 0 && n%2!=0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
         for(int i=0;i<flowerbed.length;i++){
            boolean left=i==0 || flowerbed[i-1]==0;
            boolean right=i==flowerbed.length-1 || flowerbed[i+1]==0;
              if(flowerbed[i]==0 && left && right){
                flowerbed[i]=1;
                n--;
            }
         }
        return n<=0;
    }
}