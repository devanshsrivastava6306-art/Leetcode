class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] arr = new int[n];
        int idx = 0;
        for(int i=nums.length-k;i<n;i++) {
            arr[idx++]= nums[i];
        }
        for(int i=0;i<nums.length-k;i++) {
            arr[idx++]= nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] =arr[i];
        }
    }
}