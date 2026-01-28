class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder [] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        int curr_row=0;
        int dirn=1;
        for(int i=0;i<s.length();i++){
            sb[curr_row].append(s.charAt(i));
            if(curr_row==numRows-1){
                dirn=-1;
            }
            if(curr_row==0){
                dirn=1;
            }
            curr_row+=dirn;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder ok:sb){
            res.append(ok);
        }
        return res.toString();
    }
}