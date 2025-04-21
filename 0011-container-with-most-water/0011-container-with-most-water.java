class Solution {
    public int maxArea(int[] height) {
      //optimal
      int n=height.length;
      int i=0,j=n-1,maxwater=0;
       while(i<=j){
        int wt=j-i;
        int ht=Math.min(height[i],height[j]);
        int currentwater=ht*wt;
        maxwater=Math.max(currentwater,maxwater);
        if(height[i]<height[j]){
            i++;
        }
        else{
            j--;
        }
       }
       
     return maxwater;

    }
}
        //brute force:TLE
        // int n=height.length;
        // int maxwater=0;
        // for(int i=0;i<n;i++){
        //     for(int j=n-1;j<n;j++){
        //         int ht=Math.min(height[i],height[j]);
        //         int wt=j-i;
        //         int area=ht*wt;
        //         maxwater=Math.max(maxwater,area);
        //     }
        // }
        // return maxwater;
