class Solution {

    int[] st;

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unoccupiedCount = 0;
        st = new int[4 * baskets.length];
        // Construct Segment Tree
        constructST(1, 0, baskets.length - 1, baskets);
        // Search Segment Tree
        for(int fruit: fruits) {
            if(searchST(1, 0, baskets.length - 1, fruit) == -1) {
                unoccupiedCount++;
            }
        }
        return unoccupiedCount;
    }

    public void constructST(int n, int start, int end, int[] baskets) {
        // Base case
        if(start == end) {
            st[n] = baskets[start];
            return;
        }
        int mid = start + (end-start)/2;
        constructST(2*n, start, mid, baskets);
        constructST(2*n+1, mid+1, end, baskets);
        st[n] = Math.max(st[2*n], st[2*n+1]);
    }

    public int searchST(int n, int start, int end, int val) {
        if(st[n] < val) {
            return -1;
        }
        // Base case
        if(start == end) {
            st[n] = -1; // used the value
            return start;
        }
        int mid = start + (end-start)/2;
        int pos = -1;
        if(st[2*n] >= val) {
           pos = searchST(2*n, start, mid, val); 
        } else {
           pos = searchST(2*n+1, mid+1, end, val); 
        }
        st[n] = Math.max(st[2*n], st[2*n+1]);
        return pos;
    }

    
}