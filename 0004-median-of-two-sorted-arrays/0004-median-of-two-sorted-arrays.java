class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[(nums1.length+nums2.length)];
        int i=0,j=0,k=0;
        while(i<res.length&&j<nums1.length&&k<nums2.length){
            res[i++]=(nums1[j]<nums2[k])?nums1[j++]:nums2[k++];
        }
        while(j<nums1.length){
            res[i++]=nums1[j++];
        }
        while(k<nums2.length){
            res[i++]=nums2[k++];
        }
        if(res.length%2==0){
            return (float)(res[res.length/2]+res[(res.length/2)-1])/2;
        }
        else{
             return res[res.length/2];
        }

    }
}