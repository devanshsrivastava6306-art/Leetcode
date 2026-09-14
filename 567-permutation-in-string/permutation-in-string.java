class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for(int i = 0;i <= s2.length()-s1.length();i++){
            String sb = s2.substring(i,i+s1.length());
            char[] arr1 = s1.toCharArray();
            char[] arr2 = sb.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;
    }
}
