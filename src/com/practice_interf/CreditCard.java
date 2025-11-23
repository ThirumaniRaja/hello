package com.practice_interf;

public class CreditCard implements Payable{

    @Override
    public int pay(int amount) {
        return 0;
    }

    @Override
    public int validate(int amount) {
        return 0;
    }
}
