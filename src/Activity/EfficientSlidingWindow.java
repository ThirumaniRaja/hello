package Activity;

public class EfficientSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 6, 4, 4, 5, 7, 8};
        int k = 4;

        int windowSum = 0;
        int Sum = 0;
        // run a loop k times
        // find the sum of the first window
        //1, 3, 2 -> 6
        // 3, 2, 6 -> 11
        //2, 6, 4 -> 12

        // will take var sum = 0;
        // will run loop by length of k

        for(int  i = 0; i < k; i++){
            Sum += nums[i];
        }
        System.out.println((Sum));

        for(int i = k; i < nums.length; i++){
            Sum += nums[i] - nums[i - k];
            System.out.println((Sum));

        }









//        for(var i = 0; i < k; i++) {
//            windowSum += nums[i];
//        }
//        System.out.println(windowSum);
//
//        for(var i = k; i < nums.length; i++) {
//            windowSum += nums[i] - nums[i - k];
//            System.out.println(windowSum);
//        }
    }
}
