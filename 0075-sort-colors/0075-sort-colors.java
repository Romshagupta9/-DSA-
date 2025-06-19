class Solution {
    public void sortColors(int[] arr) {
// low	0s ka area handle karta hai
// mid	current element check karta hai
// high	2s ka area handle karta hai

// nums[mid] == 0 ➝ 0 mila: low aur mid ki value swap karo, dono ko aage badhao.
// nums[mid] == 1 ➝ 1 mila: kuch mat karo, bas mid aage badhao.
// nums[mid] == 2 ➝ 2 mila: mid aur high ki value swap karo, sirf high ko peeche le jao (kyunki mid pe aayi nayi value ko check karna zaroori hai).

       int l=0;
       int m=0;
       int h=arr.length-1;
       while(m<=h){
        if(arr[m]==0){
            int temp=arr[l];
            arr[l]=arr[m];
            arr[m]=temp;
            l++;
            m++;
        }
        else if(arr[m]==1){
            m++;
        }
        else if(arr[m]==2){
            int temp=arr[m];
            arr[m]=arr[h];
            arr[h]=temp;
            h--;
        }
       }
    }
}