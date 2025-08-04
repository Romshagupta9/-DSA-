class Solution {
    public String simplifyPath(String path) {
        Stack<String>st = new Stack<>();
        String[] arr=path.split("/");
        for(String s : arr){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!st.isEmpty()){
                st.pop();
                }
            }
            else{
                st.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String b: st){
            sb.append("/").append(b);
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}
