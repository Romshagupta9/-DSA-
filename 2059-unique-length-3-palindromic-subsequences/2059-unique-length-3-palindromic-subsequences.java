class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int count = 0;
        for (char p = 'a'; p <= 'z'; p++){
            HashSet<Character>  set = new HashSet<>();
            int firOcr = 0;
            int lastOcr = 0;
            int l = 0;
            int r = n-1;
            while(l<n){
                if(s.charAt(l)==p){
                    firOcr = l;
                    break;
                }
                l++;
            }

            while(r>=0){
                if(s.charAt(r)==p){
                    lastOcr = r;
                    break;
                }
                r--;
            }
            System.out.println(firOcr + " " + lastOcr);

            for(int j=firOcr+1;j<lastOcr;j++){
                set.add(s.charAt(j));
            }

            count += set.size();
        }

        return count;
    }
}