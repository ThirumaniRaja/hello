package homework;

import java.util.Scanner;

public class OlaPrices {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rides = scan.nextInt();
        int[] prices = new int[rides];
        for(int i = 0; i < rides; i++) {
            prices[i]=scan.nextInt();
        }

        int budget = scan.nextInt();
        int count = 0;

        for(int price: prices){
            if(price <= budget) {
                count++;
            }
        }

        System.out.println(count);
//        System.out.println(rides);

    }

}
