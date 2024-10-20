import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GrowthTrendsTest {

    @Test
    public void testMixedValues() {
        int[] input = {-5, -2, 0, 3, 10};
        int[] expected = {0, 4, 9, 25, 100};
        assertArrayEquals(expected, GrowthTrends.squareAndSortGrowthPercentages(input),
                "Test with mixed positive, negative, and zero values.");
    }

    @Test
    public void testAllNegativeValues() {
        int[] input = {-8, -3, -2};
        int[] expected = {4, 9, 64};
        assertArrayEquals(expected, GrowthTrends.squareAndSortGrowthPercentages(input),
                "Test with all negative values.");
    }

    @Test
    public void testAllPositiveValues() {
        int[] input = {1, 2, 6, 5};
        int[] expected = {1, 4, 25, 36};
        assertArrayEquals(expected, GrowthTrends.squareAndSortGrowthPercentages(input),
                "Test with all positive values.");
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, GrowthTrends.squareAndSortGrowthPercentages(input),
                "Test with an empty array.");
    }

    @Test
    public void testSingleElement() {
        int[] input = {-7};
        int[] expected = {49};
        assertArrayEquals(expected, GrowthTrends.squareAndSortGrowthPercentages(input),
                "Test with a single element.");
    }

    @Test
    public void testDuplicates() {
        int[] input = {-2, -2, 2, 2};
        int[] expected = {4, 4, 4, 4};
        assertArrayEquals(expected, GrowthTrends.squareAndSortGrowthPercentages(input),
                "Test with duplicate values.");
    }
}
