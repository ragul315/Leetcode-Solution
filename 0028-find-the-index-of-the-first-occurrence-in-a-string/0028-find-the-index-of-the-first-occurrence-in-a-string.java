class Solution {
    public int strStr(String haystack, String needle) {
        int l = needle.length();
        for(int i=0;i<=haystack.length()-l;i++){
            if(haystack.substring(i,i+l).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}