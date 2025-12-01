package homework;

import java.util.Scanner;

public class SixerCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int balls = scan.nextInt();
        int sixerCount = 0;
        int[] runs = new int[balls];
        for(int i = 0; i < balls; i++) {
            runs[i] = scan.nextInt();
        }

        for(int run :runs){
            if(run == 6){
                sixerCount++;
            }
        }

        System.out.println(sixerCount);
    }
}
