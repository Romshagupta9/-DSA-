class Solution {
    public String reverseVowels(String s) {
        char [] sb=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(!isVowel(sb[i])){
                i++;
            }
            else if (!isVowel(sb[j])) {
                j--;
            }
            else{
             char temp=sb[i];
             sb[i]=sb[j];
             sb[j]=temp;
             i++;
             j--;
            }
        }
        return new String(sb);
    }
        private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}