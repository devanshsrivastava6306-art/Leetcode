class Solution {
    public int pivotInteger(int n) {
        for (int i=1;i<=n;i++) {
        int ls = sum(1,i);
        int rs = sum(i,n);
        if (ls == rs) {
            return i;
            }
        }
    return -1;
    }

    public int sum(int x,int n) {
        int s=0;
        for (int i=x;i<=n;i++) {
        s += i;
        }
        return s;
    }
}
