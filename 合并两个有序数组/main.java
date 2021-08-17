public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = A[i];
        }
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums[i] < B[j]) {
                A[k++] = nums[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i < m) {
            A[k++] = nums[i++];
        } 
        while (j < n) {
            A[k++] = B[j++];
        }
    }
}