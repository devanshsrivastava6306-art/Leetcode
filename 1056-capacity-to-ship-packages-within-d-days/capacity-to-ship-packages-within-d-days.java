class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = getMax(weights);
        int high = getSum(weights);
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canShip(weights,days,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean canShip(int[] weights,int days,int capacity){
        int countDay = 1;
        int currLoad = 0;
        for(int i=0;i<weights.length;i++){
            if(currLoad+weights[i]>capacity){
                countDay++;
                currLoad = 0;
            }
            currLoad += weights[i];
            if(countDay > days){
                return false;
            }
        }
        return true;
    }
    public int getSum(int[] weights){
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum += weights[i];
        }
        return sum;
    }
    public int getMax(int[] weights){
        int max=weights[0];
        for(int i=1;i<weights.length;i++){
            if(weights[i]>max){
                max = weights[i];
            }
        }
        return max;
    }
}