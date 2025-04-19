class Solution {
    public String reverseWords(String s) {
        if(s.startsWith(" ") || s.endsWith(" ")){
            s=s.trim();
        }
        String [] s2=(s.split("\\s+"));
        int n=s2.length;
      for (int i = 0; i < n / 2; i++) {
                String temp = s2[i];
                s2[i] = s2[n - 1 - i];
                s2[n - 1 - i] = temp;
   }

        String b=String.join(" ",s2);
        return b;
    }
}