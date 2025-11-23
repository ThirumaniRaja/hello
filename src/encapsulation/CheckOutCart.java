package encapsulation;

import java.util.Iterator;

public class CheckOutCart {
    public static void main(String[] args){
        Cart cart = new Cart();
        cart.addItems("Apple");
        cart.addItems("Banana");
        cart.addItems("Grapes");

        Iterator cartIterator = cart.getCartItems().iterator();
        while (cartIterator.hasNext()){

        }

    }
}
