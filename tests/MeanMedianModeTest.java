import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeanMedianModeTest {
    int[] nums;

    @Before
    public void setUp() throws Exception {
        nums = new int[]{1, 3, 4, 5, 20, 19, 17, 4, 10, 10, 4, 5, 7, 8, 20, 11, 13};
    }

    @Test
    public void mode() {
        assert MeanMedianMode.mode(nums) == 4 : "The most frequently occurring number should be 4";
    }

    @Test
    public void median() {
        MeanMedianMode.median(nums);
        MeanMedianMode.median(nums2);
    }

    @Test
    public void mean() {
    }
}
