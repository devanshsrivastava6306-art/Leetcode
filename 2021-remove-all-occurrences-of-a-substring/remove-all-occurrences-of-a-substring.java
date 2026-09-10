class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int indx=s.indexOf(part); 
            s = s.substring(0,indx) + s.substring(indx + part.length());
        }
        return s;
    }
}
