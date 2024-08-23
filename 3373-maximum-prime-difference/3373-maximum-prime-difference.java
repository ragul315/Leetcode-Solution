class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(isprime(nums[i])){
                min=Math.min(i,min);
                max=Math.max(i,max);
            }
        }
        System.out.println(min+" "+max);
        return Math.abs(max-min);
    }
    public boolean isprime(int n){
        if(n==1||n==0){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}