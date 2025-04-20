class Solution {
    public int compress(char[] chars) {
        int i=0,j=0;
       while(i<chars.length){
           char temp=chars[i];
           int count=0;
           while(i<chars.length && chars[i]==temp){
            i++;
            count++;
           }
           chars[j++]=temp;
           if(count>1){
              String countstr=String.valueOf(count);
              for (int k= 0; k< countstr.length(); k++) {
                    chars[j] = countstr.charAt(k);
                    j++;
                }
           }
       }
       return j;
    }
}