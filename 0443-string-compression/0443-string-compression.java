class Solution {
    public int compress(char[] chars) {
        int i=0,j=0;
        while(i<chars.length){
            char temp=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==temp){
                count++;
                i++;
                // count++;
            }
            chars[j++]=temp;
            if(count>1){
                String s=String.valueOf(count);
                for(int k=0;k<s.length();k++){
                    chars[j]=s.charAt(k);
                    j++;
                }
            }
        }
        return j;
    }
}
