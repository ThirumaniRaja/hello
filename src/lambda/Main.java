package lambda;

public class Main {
    interface PricePrint {
        int price(int p);
    }

    public static void main(String[] args){
        PricePrint p = new PricePrint() {
            @Override
            public int price(int p) {
                return p - 5;
            }
        };

        System.out.println(p.price(20));
        PricePrint p2 = p1 -> p1 + 10;

        System.out.println(p2.price(50));

    }

}
