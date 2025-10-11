class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ls= new ArrayList<>();
        if(digits.length()==0){
            return ls;
        }
        HashMap <Character,String> hm= new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        helper(hm,digits,new StringBuilder(),ls,0);
        return ls;
    }

    public void helper(HashMap<Character,String> hm,String digits,StringBuilder sb,List<String> ls,int i){
        if(i==digits.length()){
            ls.add(sb.toString());
            return ;
        }
        String curr=hm.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            helper(hm,digits,sb,ls,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}