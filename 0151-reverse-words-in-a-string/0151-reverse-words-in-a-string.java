// class Solution {
//     public String reverseWords(String s) {
//         if(s.startsWith(" ") || s.endsWith(" ")){
//             s=s.trim();
//         }
//         String [] s2=(s.split("\\s+"));
//         int n=s2.length;
//       for (int i = 0; i < n / 2; i++) {
//                 String temp = s2[i];
//                 s2[i] = s2[n - 1 - i];
//                 s2[n - 1 - i] = temp;
//    }

//         String b=String.join(" ",s2);
//         return b;
//     }
// }

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        String[] words = s.split("\\s+");

        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
}
