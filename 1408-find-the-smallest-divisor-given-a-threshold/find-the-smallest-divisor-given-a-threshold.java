class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);
        int ans = high;
        while (low<=high){
            int mid =low +(high-low)/2;
            if (can(nums,threshold,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean can(int[] nums,int threshold,int div) {
        int divide = 0;
        int i = 0;
        while (i<nums.length) {
            divide += (nums[i]+div-1)/div;
            if (divide>threshold){
                return false;
            }
            i++;
        }
        return divide <= threshold;
    }
    public int getMax(int[] nums) {
        int max = nums[0];
        int i = 1;
        while (i<nums.length) {
            if (nums[i]>max){
                max = nums[i];
            }
            i++;
        }
        return max;
    }
}