class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int last = 0;
        int result = 1;
        long sum = 0;
        for (int i = 0;i<nums.length;i++) {
            sum += nums[i];
            while ((long)nums[i]*(i-last+1)-sum > k) {
                sum -= nums[last];
                last++;
            }
            result = Math.max(result,i-last+1);
        }
        return result;
    }
}