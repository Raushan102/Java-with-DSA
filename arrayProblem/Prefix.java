package arrayProblem;

public class Prefix {

  // Method to calculate the maximum subarray sum using prefix sum technique
  public static void prefixMethod(int arr[]) {
    // Create a new array to store the prefix sums
    int prefix[] = new int[arr.length];

    // First element of the prefix sum array is the same as the input array
    prefix[0] = arr[0];

    // Calculate the prefix sum for the rest of the array
    for (int i = 1; i < arr.length; i++) {
      // Each element in the prefix array is the sum of all elements up to that index
      // in the input array
      prefix[i] = prefix[i - 1] + arr[i];
    }

    // Variable to store the maximum subarray sum, initialized to the smallest
    // possible value
    int max_sume = Integer.MIN_VALUE;

    // Nested loop to check all possible subarrays (from index i to j)
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        // Variable to store the sum of the current subarray
        int sume = 0;

        // If i is 0, the sum of the subarray is just prefix[j], otherwise, it's the
        // difference of prefix sums
        sume = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

        // If the current subarray sum is greater than the max sum, update max_sume
        if (max_sume < sume) {
          max_sume = sume;
        }
      }
    }

    // Output the maximum subarray sum found
    System.out.println(max_sume);
  }

  // Main method to run the code
  public static void main(String[] args) {
    // Input array for testing
    int array[] = { 1, -2, 6, -1, 3 };

    // Call the method to calculate the maximum subarray sum
    prefixMethod(array);
  }
}
