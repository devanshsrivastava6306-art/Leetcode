class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ar = arr.clone();
        Arrays.sort(ar);
        int rank=1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<ar.length;i++)
        {   if(!map.containsKey(ar[i]))
        {
            map.put(ar[i],rank);
            rank++;
        }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= map.get(arr[i]);
        }
        return arr;
    }
}