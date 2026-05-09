//Abstraction means hiding internal implementation details and exposing only essential functionality. The user only knows what action can be performed, not how it is implemented internally.
//For example, while using Google Pay, the user only clicks “Pay ₹1000”. The user is not concerned with how the bank communication, encryption, authentication, or transaction processing happens internally. Similarly, while riding a scooty, the rider only uses the controls and is not concerned with the internal engine mechanism. This concept is called abstraction.

abstract class Payment {

    // Abstract method
    abstract void pay(double amount);
}

// Implementation class 1
class UpiPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Implementation class 2
class CardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class Main {

    public static void main(String[] args) {

        // User only knows pay() method
        //Reference of Payment class is payment
        Payment payment;

        payment = new UpiPayment();
        payment.pay(1000);

        payment = new CardPayment();
        payment.pay(2000);
    }
}