class Solution {
    public int maximum69Number (int num) {
        char [] arr = Integer.toString(num).toCharArray();
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        String s=new String(arr);
        return Integer.parseInt(s);
    } 
}  