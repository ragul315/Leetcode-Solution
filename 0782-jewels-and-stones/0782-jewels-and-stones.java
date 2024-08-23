class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length();
        for(int i=0;i<jewels.length();i++){
            stones=stones.replaceAll(""+jewels.charAt(i),"");
        }
        return n-stones.length();

    }
}