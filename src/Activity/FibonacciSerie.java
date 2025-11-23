package Activity;


import java.util.Arrays;

public class FibonacciSerie {
    // static -> global
    // Index:   0,  1, 2,  3, 4,...
    // Initial: -1,-1,-1, -1, -1...
    //          0,  1, 1,  2, 3,...
    // Space complexity: Big O(n)
    static long[] cache;

    public static void main(String[] args) {
        // initialize the cache to -1
        int n = 3;
        // total elements in cache: 61 (including index 0)
        cache = new long[n + 1];
        Arrays.fill(cache, -1);
        System.out.println(fib(n));
    }

    /*
    Create a "cache" (an array or Map) to store results.
    At the start of the function, check the cache. If the answer is there, return it immediately.
    If the answer is not in the cache, compute it recursively.
    Before you return the new answer, save it in the cache
     */
    public static long fib(int n) {
        // base case
        if(n <= 1) return n;

        // check the cache at position n
        if(cache[n] != -1) {
            // return the value
            // = fib(n-1) + fib(n-2);
            return cache[n];
        }

        cache[n] = fib(n-1) + fib(n-2);
        // check if cache[n] == -1

        return cache[n];
    }
}

