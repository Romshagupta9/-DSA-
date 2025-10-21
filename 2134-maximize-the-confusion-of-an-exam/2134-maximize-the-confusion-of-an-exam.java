class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(check(answerKey, k, 'T'),
                        check(answerKey, k, 'F'));
    }

    private int check(String answerKey, int k, char target) {
        char [] arr = answerKey.toCharArray();
        int i = 0, j = 0, count = 0, o = 0;

        while (j < arr.length) {
            // yahan fix: compare with target instead of arr[i]
            if (arr[j] != target) {
                o++;
            }
            while (o > k) {
                if (arr[i] != target) {
                    o--;
                }
                i++;
            }
            count = Math.max(count, j - i + 1);
            j++;
        }
        return count;
    }
}
