class Solution {
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    private boolean isdigit(char c) {
        return "0123456789".indexOf(c) != -1;
    }
    private boolean isletter(char c) {
        return "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) != -1;
    }
    public boolean isValid(String word) {
        char [] arr=word.toCharArray();
        int vowel=0,conso=0;
        if(arr.length<3){
                return false;
        }
        else{
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                vowel++;
            }
            else if(!isletter(arr[i]) && !isdigit(arr[i])){
                return false;
            }
            else{
                if(!isVowel(arr[i]) && isletter(arr[i])){
                conso++;
                }
            }
         }
         if(conso>=1 && vowel>=1){
            return true;
         }
         else{
            return false;
         }
      }
    }
}