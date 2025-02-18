class Solution {
    public int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than rightmost, min must be in right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid; // min could be mid, so we don't do mid - 1
            }
        }
        return arr[left]; // Left will point to the minimum element
    }
}
