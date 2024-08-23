class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[2*n];
        for(int i=0,j=n,k=0;i<n;i++){
            res[k++]=nums[i];
            res[k++]=nums[j++];
        }
        return res;
    }
}