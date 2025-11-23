package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List fruits;

    public Cart(){
        fruits = new ArrayList();
    }

    public  boolean addItems(String item){
        if(item != null && item.isEmpty() == false ){
            fruits.add(item);
            return true;
        }
        return false;
    }

    public List getCartItems(){
        return fruits;
    }
}
