class Solution {
    public int maxDepth(String s) {
        int len=0;
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                len=Math.max(len,st.size());
            }
            else if(ch==')'){
                st.pop();
            }
        }
        return len;
    }
}