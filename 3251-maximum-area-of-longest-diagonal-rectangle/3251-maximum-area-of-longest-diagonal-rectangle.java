class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal=0;
        int current_area=0,area=0;
        double maxi=0;
        for(int i=0;i<dimensions.length;i++){
                diagonal=Math.sqrt((dimensions[i][0]*dimensions[i][0])
                +(dimensions[i][1]*dimensions[i][1]));

                current_area=dimensions[i][0]*dimensions[i][1];

                if(maxi<diagonal){
                    maxi=Math.max(maxi,diagonal);
                    area=current_area;
                }
                if(maxi==diagonal){
                    area=Math.max(current_area,area);
                }
        }
        return area;
    }
}