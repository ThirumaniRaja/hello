package Activity;

public class Pointers {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 7, 10};
        int target = 11;

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                System.out.println("Target found! Pair: " + nums[left] + " " + nums[right]);
                left++;
                right--;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}

