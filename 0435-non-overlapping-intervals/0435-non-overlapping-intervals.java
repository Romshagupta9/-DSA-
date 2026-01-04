class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->(x[1]-y[1]));
        int le=intervals[0][1];
        int res=0;
        for(int i=1;i<intervals.length;i++){
            if(le>intervals[i][0]){
                res++;
            }
            else{
                le=intervals[i][1];
            }
        } 
        return res;
    } 
} 