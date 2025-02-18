class Solution {
    public int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int min = arr[0];

        while (left < right) {
            if (arr[left] < arr[right]) {
                min = arr[left];
                right--;
            }
            if (arr[left] > arr[right]) {
                min = arr[right];
                left++;
            }

        }
        return min;
    }
}