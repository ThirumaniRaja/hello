package encapsulation;

public class UpiWallet {
    private int balance;
    private String pin;

    boolean addMoney(int amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    boolean deduct(int amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    boolean changePin(String oldpin, String newpin){
        if(oldpin == null || oldpin.equals(newpin)) return false;
        if(newpin == null || newpin.length() < 4 ) return false;
        pin = newpin.trim();
        return true;
    }

    int getBalance() { return balance; }
}

