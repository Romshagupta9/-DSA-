// class Solution {
//   public long minimumDifference(int[] nums) {
//     final int n = nums.length / 3;
//     long ans = Long.MAX_VALUE;
//     long leftSum = 0;
//     long rightSum = 0;
//     // The left part should be as small as possible.
//     Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//     // The right part should be as big as possible.
//     Queue<Integer> minHeap = new PriorityQueue<>();
//     // minLeftSum[i] := the minimum of the sum of n nums in nums[0..i)
//     long[] minLeftSum = new long[nums.length];

//     for (int i = 0; i < 2 * n; ++i) {
//       maxHeap.offer(nums[i]);
//       leftSum += nums[i];
//       if (maxHeap.size() == n + 1)
//         leftSum -= maxHeap.poll();
//       if (maxHeap.size() == n)
//         minLeftSum[i] = leftSum;
//     }

//     for (int i = nums.length - 1; i >= n; --i) {
//       minHeap.offer(nums[i]);
//       rightSum += nums[i];
//       if (minHeap.size() == n + 1)
//         rightSum -= minHeap.poll();
//       if (minHeap.size() == n)
//         ans = Math.min(ans, minLeftSum[i - 1] - rightSum);
//     }

//     return ans;
//   }
// }

class Solution {
    public long minimumDifference(int[] nums) {
        
        long[] leftMins = new long[nums.length];
        long[] rightMaxs = new long[nums.length];

        int n = nums.length;
        int oneThird = n/3;
        PriorityQueue<Integer> pqMin = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        });
        PriorityQueue<Integer> pqMax = new PriorityQueue<>();
        long minSum = 0;
        long maxSum = 0;
        long ret = Long.MAX_VALUE;


        for (int i = 0; i < oneThird; i++) {
            pqMin.offer(nums[i]);
            minSum += nums[i];
        }
        leftMins[oneThird-1] = minSum;

        for (int i = oneThird; i < n-oneThird; i++) {
            int x = nums[i];
            if (x < pqMin.peek()) {
                minSum += x-pqMin.poll();
                pqMin.offer(x);
            }

            leftMins[i] = minSum;
        }
        
        for (int i = n-1; i >= n-oneThird; i--) {
            pqMax.offer(nums[i]);
            maxSum += nums[i];
        }
        rightMaxs[n-oneThird] = maxSum;

        for (int i = n-oneThird-1; i >= oneThird-1; i--) {
            int x = nums[i];
            if (x > pqMax.peek()) {
                maxSum += x-pqMax.poll();
                pqMax.offer(x);
            }

            rightMaxs[i] = maxSum;
        }

        for (int i = oneThird-1; i < n-oneThird; i++) {
            ret = Math.min(ret, leftMins[i]-rightMaxs[i+1]);
        }

        return ret;
    }
}