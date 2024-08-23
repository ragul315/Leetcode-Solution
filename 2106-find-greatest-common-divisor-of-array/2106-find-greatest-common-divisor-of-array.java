class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int a:nums){
            max = Math.max(max,a);
            min = Math.min(min,a);
        }
        return gcd(max,min);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}