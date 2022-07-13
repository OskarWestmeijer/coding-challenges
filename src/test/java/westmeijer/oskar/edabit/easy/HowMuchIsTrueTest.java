package westmeijer.oskar.edabit.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HowMuchIsTrueTest {


    @Test
    public void containsTwoTrueItems() {

        int count = HowMuchIsTrue.countTrue(new boolean[]{true, false, false, true, false});
        Assertions.assertEquals(2, count);

    }

    @Test
    public void containsZeroTrueItems() {
        int count = HowMuchIsTrue.countTrue(new boolean[]{false, false, false, false});
        Assertions.assertEquals(0, count);
    }

    @Test
    public void handlesEmptyArrayCorrectly() {
        int count = HowMuchIsTrue.countTrue(new boolean[]{});
        Assertions.assertEquals(0, count);
    }

}
