class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
        return "";
        String compare = strs[0];
        for(int i = 1;i<strs.length;i++) {
            String current = strs[i];
            int j = 0;
        while (j<compare.length() && j<current.length() && compare.charAt(j) == current.charAt(j)) {
                j++;
            }
            compare=compare.substring(0,j);
            if (compare.isEmpty()) 
            return "";
        }
        return compare;
    }
}