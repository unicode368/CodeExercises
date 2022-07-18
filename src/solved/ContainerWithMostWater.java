package solved;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] heights = new int[]{1,1};
        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int j = height.length - 1;
        int i = 0;
        while (i != j) {
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) {
                --j;
            } else {
                ++i;
            }
        }
        return max;
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
