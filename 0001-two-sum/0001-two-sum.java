import java.util.*;

class Solution {
    public static int[] twoSum(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == key) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two elements add up to the key.");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target key: ");
        int key = sc.nextInt();

        int result[] = twoSum(arr, key); 
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        
        sc.close();
    }
}
