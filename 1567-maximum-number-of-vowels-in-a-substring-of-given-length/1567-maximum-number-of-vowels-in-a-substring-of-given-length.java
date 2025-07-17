class Solution {
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) !=-1;
    }
    public int maxVowels(String s, int k) {
       char [] arr = s.toCharArray();
       int count=0,maxlen=0;
       int i=0,j=0;
       for(i=0;i<arr.length;i++){
          while((j-i)<k && j<arr.length){
          if(isVowel(arr[j])){
            count++;
            j++;
        }
        else if(!isVowel(arr[j])){
            j++;
        }
        maxlen=Math.max(count,maxlen);
        if (j - i == k && isVowel(arr[i])) {
                count--;
       }
    }
}
     return maxlen;

}
}