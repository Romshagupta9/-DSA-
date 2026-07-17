class Solution {
    public List<List<String>> partition(String s) {
        //m1: backtracking
        //REASON : 'all' psbl ->backtracking

        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        solve(s, 0, temp, ans);
        return ans;
    }

    static void solve(String s, int start, List<String> temp , List<List<String>> ans) {
        //base case
        if (start >= s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            //do 
            String str = s.substring(start, i + 1);

            if (ispalindrome(str)) {
                temp.add(str);
                solve(s, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }

            
        }
    }

    static boolean ispalindrome(String str) {
        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }
}