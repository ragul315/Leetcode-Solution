public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length;
        int[] arr = new int[n];
        int sum = 0;
        int max = height[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            arr[i] = max;
        }
        max = height[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            sum += Math.min(arr[i], max) - height[i];
        }
        return sum;
    }
}
