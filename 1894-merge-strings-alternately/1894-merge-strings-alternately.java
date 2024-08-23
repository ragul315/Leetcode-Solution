class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length(),w2=word2.length();
        String s="";
        for(int i=0,j=0;i<w1||j<w2;i++,j++){
            s+=(i<w1)?word1.charAt(i):"";
            s+=(j<w2)?word2.charAt(j):"";
        }
        return s;
    }
}