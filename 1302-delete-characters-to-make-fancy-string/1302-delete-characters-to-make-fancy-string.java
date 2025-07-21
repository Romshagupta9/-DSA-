class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i=0;i<n;i++){
            if(i>0 && s.charAt(i) == s.charAt(i-1)){
                count ++;
            }
            else{
                count = 1;
            }

            if(count<=2){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
       
    }
}