public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] heights = new int[]{1,1};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] height) {
        nt max = 0;
        int maxIndex = 0;
        int prevMax = 0;
        int prevMaxIndex = 0;
        for(int i = 0; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
                maxIndex = i;
            } else if (height[i] * (i - maxIndex)
                    > prevMax * (prevMaxIndex - maxIndex)) {
                prevMax = height[i];
                prevMaxIndex = i;
            }
        }
        return prevMax * Math.abs(prevMaxIndex - maxIndex);
    }

    public int maxArea2(int[] height) {
        int max = 0;
        for(int left = 0; left < height.length - 1; left++) {
            for(int right = left + 1; right < height.length; right++) {
                int area = (right - left) * Math.min(height[right], height[left]);
                if(max < area) {
                    max = area;
                }
            }
        }
        return max;
    }
}
