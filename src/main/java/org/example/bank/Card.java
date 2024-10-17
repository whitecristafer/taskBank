package org.example.bank;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Card {
    private final long CARD_NUMBER;
    private int pinCode;

    public Card(long CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
        this.pinCode = generatePin();
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        if (String.valueOf(pinCode).length() == 4) this.pinCode = pinCode;
        else System.out.println("The PIN code must contain 4 characters");
    }

    public int generatePin() {
        Random r = new Random();
        return Integer.valueOf(
                r.nextInt(1,9)+""+r.nextInt(9)+""+r.nextInt(9)+""+r.nextInt(9)
        );
    }
    public void showCardInfo() {
        System.out.println(CARD_NUMBER + " " + pinCode);
    }
}
