class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1=new Stack<>(); //integer stack to store the numbers
        Stack<String>  st2=new Stack<>();// string stack to store the string
        int count=0;
        String curr="";
        for(char i : s.toCharArray()){
            if(Character.isDigit(i)){
                count=(count*10)+(i-'0');
            }
            else if(i=='['){
                st1.push(count);
                st2.push(curr);
                count=0;
                curr="";
            }
            else if(i==']'){
                StringBuilder sb=new StringBuilder(st2.pop());
                int k=st1.pop();
                for(int j=0;j<k;j++){
                    sb.append(curr);
                }
                curr=sb.toString();
            }
            else{
                curr+=i;
            }
        }
        return curr;
    }
}