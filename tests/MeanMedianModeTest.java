import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeanMedianModeTest {
    int[] nums;
    int[] nums2;
    int[] nums3;

    @Before
    public void setUp() throws Exception {
        nums = new int[]{1, 3, 4, 5, 20, 19, 17, 4, 10, 10, 4, 5, 7, 8, 20, 11, 13};
        nums2 = new int[]{5, 10, 500, 350, 217, 500, 15, 46, 10, 500};
        nums3 =  new int[]{5, 5, 1, 10, 10};
    }

    @Test
    public void mode() {
        assert MeanMedianMode.mode(nums).contains(4) : "The most frequently occurring number should be 4";
        assert MeanMedianMode.mode(nums2).contains(500): "The most frequently occurring number should be 500";
        assert MeanMedianMode.mode(nums3).contains(5) && MeanMedianMode.mode(nums3).contains(10) : "Both modes should " +
                "have been found";
    }

    @Test
    public void median() {
        MeanMedianMode.median(nums);
        MeanMedianMode.median(nums2);
    }

    @Test
    public void mean() {
        MeanMedianMode.mean(nums, 2);
        MeanMedianMode.mean(nums2, 2);
    }
}
