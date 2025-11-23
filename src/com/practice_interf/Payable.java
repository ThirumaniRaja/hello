package com.practice_interf;

public interface Payable {
    int pay(int amount);
    int validate(int amount);
    static String currency(){return "INR";}
}
