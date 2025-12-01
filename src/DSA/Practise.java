package DSA;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] inflow = new int[n];
        int[] outflow = new int[n];

        for (int i = 0; i < n; i++) {
            inflow[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            outflow[i] = sc.nextInt();
        }

        int totalPenalty = 0;
        int dryDays = 0;
        int overflowDays = 0;

        for (int i = 0; i < n; i++) {
            int net = inflow[i] - outflow[i];
            int penalty = 0;

            if (net < 0) {
                penalty += 100;
                dryDays++;
            } else if (net > 500) {
                penalty += 50;
                overflowDays++;
            }

            if (net % 3 == 0) {
                penalty += 30;
            }

            totalPenalty += penalty;
        }

        System.out.println(totalPenalty + " " + dryDays + " " + overflowDays);
    }
}
