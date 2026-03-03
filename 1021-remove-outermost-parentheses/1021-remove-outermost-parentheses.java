class Solution {
    public String removeOuterParentheses(String s) {
        int sum=0,start=0,end=0;
        StringBuilder sb=new StringBuilder();
        while(end<s.length()){
            char ch=s.charAt(end);
            if(ch=='('){
                sum++;
            }
            else{
                sum--;
            }
            if(sum==0){
                sb.append(s.substring(start+1,end));
                start=end+1;
            }
            end++;
        } 
        return sb.toString();
    }
}