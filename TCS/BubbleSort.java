import java.util.*;
import java.io.*;

public class BubbleSort {
    
    // Function to count minimum swaps required to sort array
    public static int minSwapsToSort(int[] arr, int[] sortedArr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];  // To track if element has been visited
        int swaps = 0;
        
        // Create an array of pairs (element, index)
        int[] indexArr = new int[n];
        for (int i = 0; i < n; i++) {
            indexArr[i] = i;
        }
        
        // Sort the index array based on the values in sortedArr
        Arrays.sort(indexArr, (a, b) -> Integer.compare(sortedArr[a], sortedArr[b]));
        
        // Traverse elements to calculate number of swaps
        for (int i = 0; i < n; i++) {
            if (visited[i] || indexArr[i] == i) {
                // Already visited or already in correct position
                continue;
            }
            
            // Calculate size of cycle
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = indexArr[j];
                cycleSize++;
            }
            
            // Add to total number of swaps needed
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }
        
        return swaps;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Create sorted versions of the array
        int[] ascSorted = Arrays.copyOf(arr, n);
        Arrays.sort(ascSorted);
        
        int[] descSorted = Arrays.copyOf(arr, n);
        Arrays.sort(descSorted);
        for (int i = 0; i < n / 2; i++) {
            // Reverse the array to get descending order
            int temp = descSorted[i];
            descSorted[i] = descSorted[n - i - 1];
            descSorted[n - i - 1] = temp;
        }
        
        // Find minimum swaps for ascending and descending order
        int ascSwaps = minSwapsToSort(arr, ascSorted);
        int descSwaps = minSwapsToSort(arr, descSorted);
        
        // Output the minimum of the two
        System.out.println(Math.min(ascSwaps, descSwaps));
        
        sc.close();
    }
}
