import java.util.*;

// Linear search is a simple searching algorithm that checks each element in an array sequentially
// until the target element is found or the end of the array is reached.
// It has a time complexity of O(n) in the worst case, where n is the number of elements in the array.

public class Array_linear_search {
    public static int linear_search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Return index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linear_search(numbers, key); // Store the result

        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found.");
        }
    }
}
