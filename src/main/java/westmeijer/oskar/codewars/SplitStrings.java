package westmeijer.oskar.codewars;


import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
 * <p>
 * Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number
 * of characters then it should replace the missing second character of the final pair with an underscore ('_').
 */
public class SplitStrings {

    /**
     * First creative (verbose) solution.
     *
     * @param s
     * @return
     */
    public static String[] solution(String s) {
        // determine array size (check for odd number buffer space)
        int times = s.length() / 2;
        int rest = s.length() % 2;
        int arraySize = times + rest;
        String[] finalArray = new String[arraySize];
        System.out.println("Provided String: " + s);
        System.out.println("Array size: " + finalArray.length);

        // start filling array - increment by 2
        char[] charArr = s.toCharArray();
        for (int i = 0; i <= charArr.length - 1; i += 2) {
            // select char pair
            char pairA = charArr[i];
            char pairB;

            // if odd number and on last char
            if ((i + 1) == charArr.length && rest != 0) {
                pairB = '_';
            } else {
                pairB = charArr[i + 1];
            }

            String newEle = "" + pairA + pairB;
            System.out.println("New Element: " + newEle);

            // fill in new array
            for (int x = 0; x <= finalArray.length; x++) {
                String currentEle = finalArray[x];
                if (currentEle == null) {
                    finalArray[x] = newEle;
                    System.out.println("Added new element on position " + x + "/" + finalArray.length);
                    break;
                }
            }
        }

        System.out.println("Solution: " + Arrays.toString(finalArray));
        return finalArray;
    }


    public static String[] fastSolution(String s) {
        System.out.println("Provided string: " + s);

        boolean hasOddSize = (s.length() % 2) > 0;

        System.out.println("Has oddSize: " + hasOddSize);

        // guava lib
        List<String> resultList = new ArrayList<String>();
        Iterable<String> pieces = Splitter.fixedLength(2).split(s);
        pieces.forEach(resultList::add);

        if (hasOddSize) {
            String lastElement = resultList.get(resultList.size() - 1);
            resultList.set(resultList.size() - 1, lastElement += "_");
            System.out.println(lastElement);
        }

        System.out.println("Result size: " + resultList.size());

        String[] resultArr = resultList.toArray(new String[0]);
        System.out.println(Arrays.toString(resultArr));
        return resultArr;
    }


}
