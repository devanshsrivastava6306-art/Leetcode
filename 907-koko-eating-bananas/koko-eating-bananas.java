class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);

        while (low < high) {
            int mid = low + (high - low) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
                if (hours > h) break;
            }
            if (hours <= h) {
                high = mid;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int getMax(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }
}
