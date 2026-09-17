class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr1[a]=nums[i];
                a++;
            }
            else{
                arr2[b]=nums[i];
                b++;
            }
        }
        for(int i=0;i<b;i++){
            nums[i]=arr2[i];
        }
        for(int i=0;i<a;i++){
            nums[b+i]=arr1[i];
        }
        return ;
    }
}