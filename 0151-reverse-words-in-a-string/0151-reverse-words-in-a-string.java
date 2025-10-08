class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        int l=0,r=words.length-1;
        while(l<r){
            String temp=words[l];
            words[l]=words[r];
            words[r]=temp;
            l++;
            r--;
        }
        return String.join(" ",words);
    }
}