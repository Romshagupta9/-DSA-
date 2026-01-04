class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        
        for (int num : nums) {
            int foundDivisor = 0;
            
            for (int divisor = 2; divisor * divisor <= num; divisor++) {
                if (num % divisor == 0) {
                    if (foundDivisor == 0) {
                        foundDivisor = divisor;
                    } else {
                        foundDivisor = 0;
                        break;
                    }
                }
            }
            
            if (foundDivisor > 0 && foundDivisor != num / foundDivisor) {
                totalSum += 1 + num + foundDivisor + num / foundDivisor;
            }
        }
        
        return totalSum;
    }
}