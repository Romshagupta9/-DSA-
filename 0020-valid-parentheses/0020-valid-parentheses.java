class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if((top=='[' && ch!=']') ||
                    (top=='(' && ch!=')') ||
                    (top=='{' && ch!='}')){
                        return false;
                    }
            }
            i++;
        }
        return st.isEmpty();
    }
}