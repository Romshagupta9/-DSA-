class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>ls=new ArrayList<>();
        for(int i:nums1){
            ls.add(i);
        } 
        for(int i:nums2){
            ls.add(i);
        }
        Collections.sort(ls);
        int n=ls.size();
        int l=0;
        int h=ls.size()-1;
        int m=(l+h)/2;
        double res=0.0; 
        if(ls.size()%2==0){
            res=(ls.get(m)+ls.get(m+1))/2.0;
        }
        else{
            res=ls.get(m);
        }
        return res;
    }
}