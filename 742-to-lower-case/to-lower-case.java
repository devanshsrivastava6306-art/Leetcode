class Solution {
    public String toLowerCase(String s) {
        String st="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64 && s.charAt(i)<91){
                st= st+(char)(s.charAt(i)+32);
            }
            else{
            st=st+ s.charAt(i);
            }
        }
        return st;
    }
}