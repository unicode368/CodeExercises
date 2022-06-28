import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ContainerWithMostWaterTest {

    @Test
    public void testGeneral() {
        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
        Assertions.assertEquals(49,
                ContainerWithMostWater.maxArea(heights));
    }

    @Test
    public void testTwoSame() {
        int[] heights = new int[]{1,1};
        Assertions.assertEquals(1,
                ContainerWithMostWater.maxArea(heights));
    }

    @Test
    public void testWidthLonger() {
        int[] heights = new int[]{1,2,1};
        Assertions.assertEquals(2,
                ContainerWithMostWater.maxArea(heights));
    }
}
