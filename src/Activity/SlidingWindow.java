package Activity;

public class SlidingWindow {

    public static void main(String[] args){
        // Problem: Print the sum of every 3 consecutive numbers
        int[] nums = {1, 3, 2, 6, 4};
        int k = 3;

// Brute-force approach: recomputes each window fully (O(n*k))
        for(int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
//         System.out.println((nums[i]));
         for(int j = i; j < i+k; j++){
             sum += nums[j];
         }
            System.out.println(sum);

        }

// Output: 6 11 12 (on new lines)
    }


}
