class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ls=new ArrayList<>();
        HashMap<Character,String> hm=new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        helper(digits,hm,ls,new StringBuilder(),0);
        return ls;
    }    
    public void helper(String digits,HashMap<Character,String> hm
    ,List<String> ls,StringBuilder sb,int i){
        if(i==digits.length()){
            ls.add(sb.toString());
            return;
        }
        String curr=hm.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            helper(digits,hm,ls,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
        } 
    }
} 