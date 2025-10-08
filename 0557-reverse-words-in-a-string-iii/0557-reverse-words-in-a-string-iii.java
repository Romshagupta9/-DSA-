class Solution {
    public String reverseWords(String s) {
        Stack <Character> st=new Stack<>();
        String s2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                st.push(ch);
            }
            else{
                while(!st.isEmpty()){
                    s2=s2+st.pop();
                }
                s2=s2+' ';
            }
        }
        while(!st.isEmpty()){
                    s2=s2+st.pop();
                }
        return s2;
    }
}