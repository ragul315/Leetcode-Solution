class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String res=s+s;
        String re = res.substring(1,res.length()-1);
        return re.contains(s);
        
    }
}