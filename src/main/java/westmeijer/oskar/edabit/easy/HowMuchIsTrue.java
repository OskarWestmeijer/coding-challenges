package westmeijer.oskar.edabit.easy;

import java.util.Arrays;

/**
 * https://edabit.com/challenge/vKpGt4ufSKmEJ3Xjd
 * <p>
 * 13.07.2022 Oskar Westmeijer
 */
public class HowMuchIsTrue {

    /**
     * Counts the number of true items in the given array.
     * <p>
     * Returns 0 if array is empty.
     *
     * @param arr
     * @return
     */
    public static int countTrue(boolean[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int trueItemsCount = 0;

        for (boolean bool : arr) {
            if (bool) {
                trueItemsCount += 1;
            }
        }

        return trueItemsCount;
    }

    public static int bestSolution(boolean[] arr) {
        int count = 0;
        for (boolean b : arr) {
            if (b) {
                count++;
            }
        }
        return count;
    }

}
