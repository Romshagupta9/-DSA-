class Solution {
    public boolean backspaceCompare(String s, String t) {
        String m="",p="";
        Stack<Character> st1 =new Stack<>();
        Stack<Character> st2 =new Stack<>();
        int i=0,j=0;
        while(i<s.length()){
            if(s.charAt(i) == '#') {
    if (!st1.isEmpty()) {
        st1.pop();
    }
}

            else{
              st1.push(s.charAt(i));
            }
            i++;
        }

           while(j<t.length()){
            if(t.charAt(j) == '#') {
    if (!st2.isEmpty()) {
        st2.pop();
    }
}

            else{
               st2.push(t.charAt(j));
            }
            j++;
        }

        // while(!st1.isEmpty() && !st2.isEmpty()){
        //      m=m+st1.pop();
        //      p=p+st2.pop();
        // }
        // if(m.equals(p)){
        //     return true;
        // }
        // return false;
        return st1.equals(st2);
    }
}

