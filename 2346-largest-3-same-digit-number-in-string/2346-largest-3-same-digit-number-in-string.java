class Solution {
    public String largestGoodInteger(String num) {
        String ans="";String triplet="";
        int length=0;
        for(int i=0;(i+2)<num.length();i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                triplet=num.substring(i,i+3);
                if (triplet.compareTo(ans) > 0) { // Compare lexicographically
                    ans = triplet;
                }
            }
        }
        return ans;
    }
}
