class Solution {
    public int findPermutationDifference(String s, String t) {
        var sum=0;
        for(var i=0;i<s.length();i++){
            sum+=Math.abs(t.indexOf(s.charAt(i))-i);
        }
        return sum;
    }
}