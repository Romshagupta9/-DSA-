class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length()==0){
            return 0;
        }
        int i=0,count=0;
        Stack<Character> st=new Stack<>();
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            i++;
        }
        return st.size();
    }
}