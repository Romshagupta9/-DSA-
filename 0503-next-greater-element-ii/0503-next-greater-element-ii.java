// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
        
//     }
// }


class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int l2=nums.length;
        int arr[]=new int[l2];
        for(int i=2*l2-1;i>=0;i--){

             while(!st.isEmpty() && st.peek()<=nums[i%l2]){
                       st.pop();
             }
             if(i<l2){
             if(st.isEmpty()){
                arr[i]=-1;
             }
             else{
                arr[i]=st.peek();
             }
             }
    st.push(nums[i % l2]);
        }
        return arr;
    }
  
    }
