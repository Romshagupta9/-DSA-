class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int l2=nums2.length;
        int arr[]=new int[100000];
        for(int i=l2-1;i>=0;i--){
             int curr=nums2[i];
             while(!st.isEmpty() && st.peek()<curr){
                       st.pop();
             }
             if(st.isEmpty()){
                arr[curr]=-1;
             }
             else{
                arr[curr]=st.peek();
             }
             st.push(curr);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=arr[nums1[i]];
        }
        return nums1;
    }
}