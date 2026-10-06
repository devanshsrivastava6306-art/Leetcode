class Solution {
    public int findKthPositive(int[] arr, int k) {
        int last = arr[arr.length - 1];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        ArrayList<Integer> missing =new ArrayList<>();
        for (int i=1;i<=last;i++) {
            if (!set.contains(i)) {
                missing.add(i);
            }
        }
        if (missing.size() >= k) {
            return missing.get(k-1);
        } 
        else {
            return last+(k-missing.size());
        }
    }
}
