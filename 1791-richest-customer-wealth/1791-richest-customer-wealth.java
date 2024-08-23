class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
            sum=Math.max(sum,s);
        }
        return sum;
    }
}