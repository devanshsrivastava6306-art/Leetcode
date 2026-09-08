class Solution {
    public int countCommas(int n) {
        int count = 0;
        for (int i=1;i<=n;i++) {
            int digits = digitCount(i);
            count += (digits-1)/3;
        }
        return count;
    }

    public int digitCount(int num) {
        int no = 0;
        while (num>0) {
            no++;
            num /= 10;
        }
        return no;
    }
}
