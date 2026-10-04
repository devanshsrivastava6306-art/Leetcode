class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int total = (int) m*k;
        if (total > bloomDay.length){
            return -1;
        }
        int low = 1;
        int high = getMax(bloomDay);
        while (low<high) {
            int mid = low+(high-low)/2;
            if (canMake(bloomDay,m,k,mid)) {
                high = mid;
            }
            else {
                low = mid+1;
            }
        }
        if (canMake(bloomDay,m,k,low)) {
            return low;
        } 
        else {
            return -1;
        }
    }

    private boolean canMake(int[] bloomDay,int m,int k,int days) {
        int bouquets = 0;
        int flwrno = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                flwrno++;
                if (flwrno == k) {
                    bouquets++;
                    flwrno = 0;
                }
            } else {
                flwrno = 0;
            }
        }
        return bouquets >= m;
    }
    private int getMax(int[] bloomDay) {
        int max = bloomDay[0];
        for (int i = 1;i<bloomDay.length;i++) {
            if (bloomDay[i]>max) {
                max = bloomDay[i];
            }
        }
        return max;
    }
}
