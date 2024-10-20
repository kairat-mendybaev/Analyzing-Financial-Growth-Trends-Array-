import java.util.Arrays;
import java.util.Scanner;

// Example 1:
//Input: growthPercentages = [-5, -2, 0, 3, 10]
//Output: [0, 4, 9, 25, 100]
//Explanation: After squaring, the array becomes [25, 4, 0, 9, 100]. After sorting, it becomes [0, 4, 9, 25, 100].
//Example 2:
//Input: growthPercentages = [-8, -3, 2, 4, 12]
//Output: [4, 9, 16, 64, 144]

public class GrowthTrends {

    public static int[] squareAndSortGrowthPercentages(int[] growthPercentages) {
        // Check if the input array is empty
        if (growthPercentages == null || growthPercentages.length == 0) {
            return new int[0];
        }

        // Square each element in the growth percentages array
        for (int i = 0; i < growthPercentages.length; i++) {
            growthPercentages[i] = growthPercentages[i] * growthPercentages[i];
        }

        // Sorts the array
        Arrays.sort(growthPercentages);
        return growthPercentages;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements in the array
        System.out.print("Enter number of elements in the array: ");
        int numElements = scanner.nextInt();

        // holds the user's input
        int[] growthPercentages = new int[numElements];

        // user enters the individual elements
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < numElements; i++) {
            growthPercentages[i] = scanner.nextInt();
        }

        // Call the function to square and sort the growth percentages
        int[] result = squareAndSortGrowthPercentages(growthPercentages);

        System.out.println("Sorted squared growth percentages: " + Arrays.toString(result));
    }
}

// Time Complexity:
//The time complexity of the squareAndSortGrowthPercentages method is dominated by two key operations:
//1.Squaring Each Element: The method iterates over each element in the array and squares it. This operation takes O(n), where n is the number of elements in the input array.
//2.Sorting the Array: After squaring, the array is sorted using Arrays.sort(), which has a time complexity of O(nlogn).
//Overall time complexity: O(n \log n).

//Space Complexity:
//The space complexity of the method is as follows:
//1.In-Place Modification: The input array is squared in place, so no extra space is required for squaring the elements.
//2.Sorting: Java’s Arrays.sort() typically uses O(n) space for temporary storage during sorting.
//Overall space complexity: O(n)

//Summary:
//Time Complexity: O(nlogn)
//Space Complexity: O(n)
