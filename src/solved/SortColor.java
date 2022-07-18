package solved;

public class SortColor {

    int[] unsortedArray;

    public SortColor(int[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    public static void sortColors(int[] nums) {
        int lastRed = -1;
        int lastBlue = nums.length;
        int temp;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 2) {
                while(i < lastBlue && nums[--lastBlue] == 2) {
                    continue;
                }
                if(i < lastBlue) {
                    temp = nums[lastBlue];
                    nums[lastBlue] = 2;
                    nums[i] = temp;
                }
            }
            if(nums[i] == 0) {
                while(i > lastRed && nums[++lastRed] == 0) {
                    continue;
                }
                if(i > lastRed) {
                    temp = nums[lastRed];
                    nums[lastRed] = 0;
                    nums[i] = temp;
                }
            }
        }
    }

    public void sortColors() {
        int lastRed = -1;
        int lastBlue = unsortedArray.length;
        int temp;
        for(int i = 0; i < unsortedArray.length; i++) {
            if(unsortedArray[i] == 2) {
                while(i < lastBlue && unsortedArray[--lastBlue] == 2) {
                    continue;
                }
                if(i < lastBlue) {
                    temp = unsortedArray[lastBlue];
                    unsortedArray[lastBlue] = 2;
                    unsortedArray[i] = temp;
                }
            }
            if(unsortedArray[i] == 0) {
                while(i > lastRed && unsortedArray[++lastRed] == 0) {
                    continue;
                }
                if(i > lastRed) {
                    temp = unsortedArray[lastRed];
                    unsortedArray[lastRed] = 0;
                    unsortedArray[i] = temp;
                }
            }
        }
    }

    public int[] getUnsortedArray() {
        return unsortedArray;
    }
}
