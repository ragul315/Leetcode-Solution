class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m+n;
        int[] arr = new int[l];
        int i=0,j=0,k=0;
        while(j!=m&&k!=n){
            if(nums1[j]<nums2[k]){
                arr[i++]=nums1[j++];
            }
            else{
                arr[i++]=nums2[k++];
            }
        }
        while(j!=m){
            arr[i++]=nums1[j++];
        }
        while(k!=n){
            arr[i++]=nums2[k++];
        }
        System.arraycopy(arr, 0, nums1, 0, arr.length);
    }
}