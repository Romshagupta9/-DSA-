// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int i=0,j=i+1,k=i+2;
//         while(i<j && j<k && k<nums.length){
//             if(nums[i]<nums[j] && nums[j]<nums[k]){
//                 return true;
//             }
//             else{
//                     i++;
//                     j++;
//                     k++;
//                 }
//             }
//             return false;
//         }  
// }



class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num; // smallest so far
            } else if (num <= second) {
                second = num; // second smallest
            } else {
                return true; // num > second -> triplet found
            }
        }
        return false;
    }
}


