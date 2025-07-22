class Solution {
    public int longestPalindrome(String s) {
        char [] arr=s.toCharArray();
        int oddcount=0;
        //hashmap to count the frequency of the characaters
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch : arr){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.get(ch)%2==1){
                oddcount++;
            }
            else{
                oddcount--;
            }
        }
        if(oddcount>1){
            return arr.length-oddcount+1;
        }
    return arr.length;
    }
}