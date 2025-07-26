class Solution {
    public long maxSubarrays(int n, int[][] conflictingPairs) {
        List<List<Integer>> conflicts = new ArrayList<>();
        for(int i=0 ; i<=n ; i++)
            conflicts.add(new ArrayList<>());
        
        for(int[] c : conflictingPairs) {
            int left = c[0], right = c[1];
            if(left>right) {
                int temp = left;
                left = right;
                right = temp;
            }
            conflicts.get(right).add(left);
        }
        long[] restrictRemoval = new long[n+1];
        int leftMaxRestrict = 0, leftSecondMaxRestrict = 0;
        long res = 0L;
        for(int i=1 ; i<=n ; i++) {
            for(Integer ele : conflicts.get(i)) {
                if(ele > leftMaxRestrict) {
                    leftSecondMaxRestrict = leftMaxRestrict;
                    leftMaxRestrict = ele;
                } else if(ele > leftSecondMaxRestrict)
                    leftSecondMaxRestrict = ele;
            }
            res += 0L + i - leftMaxRestrict;
            restrictRemoval[leftMaxRestrict] += leftMaxRestrict - leftSecondMaxRestrict;
        }
        long maxRemovalVal = 0L;
        for(int i=1 ; i<=n ; i++)
            maxRemovalVal = Math.max(maxRemovalVal, restrictRemoval[i]);
        res += maxRemovalVal;
        return res;
    }
}