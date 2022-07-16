package westmeijer.oskar.edabit.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import westmeijer.oskar.codewars.SplitStrings;

import java.util.Arrays;

public class SplitStringsTest {

    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        Assertions.assertEquals("[ab, cd, ef]", Arrays.toString(SplitStrings.solution(s)));
        Assertions.assertEquals("[He, ll, oW, or, ld]",
                Arrays.toString(SplitStrings.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        Assertions.assertEquals("[ab, cd, e_]", Arrays.toString(SplitStrings.solution(s)));
        Assertions.assertEquals("[Lo, ve, Pi, zz, a_]",
                Arrays.toString(SplitStrings.solution(s1)));
    }

     // ---- fast Tests -----
    @Test
    public void fastTestEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        Assertions.assertEquals("[ab, cd, ef]", Arrays.toString(SplitStrings.fastSolution(s)));
        Assertions.assertEquals("[He, ll, oW, or, ld]",
                Arrays.toString(SplitStrings.fastSolution(s1)));
    }

    @Test
    public void fastTtestOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        Assertions.assertEquals("[ab, cd, e_]", Arrays.toString(SplitStrings.fastSolution(s)));
        Assertions.assertEquals("[Lo, ve, Pi, zz, a_]",
                Arrays.toString(SplitStrings.fastSolution(s1)));
    }

}
